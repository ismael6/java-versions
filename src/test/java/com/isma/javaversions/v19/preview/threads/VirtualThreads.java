package com.isma.javaversions.v19.preview.threads;


/**
 *
 * +++ OS Thread -> Operating System Thread
 * +++ Platform Thread -> Adapter for OS thread to be uniform with JVM implementations
 *       - OS Thread = Platform Thread
 *       - Cardinality -> 1:1
 *          Java Thread lifecycle:
 *              1. Created                              (IDLE)
 *              2. Waits in the thread pool to be used  (IDLE)
 *              3. Makes a request to database.         (WORKING)
 *              4. Waits for response                   (IDLE)
 *              5. Processes response                   (WORKING)
 *              6. Goes back to the thread pool         (IDLE)
 *              7. Repeat from step 2                   (IDLE)
 *
 * -------------------------java19-------------------------
 * +++ Virtual Threads -> Java thread (like inversion of control on threads)
 *      Managed by JVM
 *          IDLE state -> goes to the heap
 *          Working state -> Use some platform thread as work station
 *      Living in heap memory
 *      Kbs size
 *      Almost instantaneous initialization
 */
public class VirtualThreads {

}
