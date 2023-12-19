package com.isma.javaversions.v20.preview;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

/**
* 1.2 (1998) -> ThreadLocal
*  * Motivation
*       -Share data between components without using method arguments
*           - safe  MYSERVICEA(move sensitive data to B) -> OTHERSERVICE (having lot of third party libs) -> MYSERVICEB
*           - reduce arguments overload
*           - ThreadLocal has thread scope (Map<Thread, variable>)
* */
class ThreadLocals{

    ThreadLocal<String> threadLocal = new ThreadLocal<>();

    @Test
    public void test(){

        // thread 1
        threadLocal.set("Pete"); // set the value for the current thread -> threadLocal.put(thisThread, "Pete")
        threadLocal.get(); // get the value for the current thread -> threadLocal.get(thisThread)

        // thread 2
        threadLocal.set("Roger"); // set the value for the current thread -> threadLocal.put(thisThread, "Roger")
        threadLocal.get(); // get the value for the current thread -> threadLocal.get(thisThread)


        /**
         * Mutable -> hard to track state changes across application
         * ThreadLocal attached to platform thread; variable lives until remove() is called or thread dies -> memory leaks
         * Every new Thread creates a copy of all the current thread ThreadLocal variables -> memory overload
         *
         * VirtualThread strategy allows to create million of threads really fast -> ThreadLocal carries to instant memory overload
         *
         */

    }
}

/**
 * immutable
 * virtual thread attached to thread and method scope
 * child threads do not create a copy of scopedValues, instead point to the immutable references
 *
 */
public class ScopedValues {

    ScopedValue<String> scopedValue = ScopedValue.newInstance();

    @Test
    public void test() throws Exception {
        Callable<String> getFromDb = this::getFromDb;
        String result = ScopedValue.where(scopedValue, "ABC")
                            .call(getFromDb);
        scopedValue.isBound(); // false
        scopedValue.get(); // throw NoSuchElementException
        scopedValue.orElse("defaultValue");
        scopedValue.orElseThrow(IllegalArgumentException::new);
    }

    String getFromDb(){
        scopedValue.isBound(); // only true if caller defined it in where method
        return "";
    }
}