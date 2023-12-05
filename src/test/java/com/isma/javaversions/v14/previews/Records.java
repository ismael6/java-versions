package com.isma.javaversions.v14.previews;

import org.junit.jupiter.api.Test;

import java.io.Serializable;
import java.util.Objects;

public class Records {

    @Test
    public void before(){

        class Person{
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                var person = (Person) o;
                return age == person.age && Objects.equals(name, person.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
    }

    @Test
    public void usingRecords(){
        record Person(String name, int age){}

        var p = new Person("peter", 30);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.toString());
        System.out.println(p.hashCode());
        System.out.println(p.equals(p));
    }

    @Test
    public void recordsOnDetail() {
        record Person(String name, int age) implements Serializable { } //can implement interfaces


        var p = new Person("peter", 30);
        //p.age = 5; //immutable fields by default
        //new Person(){}; //records are final by default (cannot extend from them)
        //record T() extends Records{} // cannot use extends

        record Test(int age) {

            //private int i1; not allowed explicit instance fields

            private static int s1; //allowed static fields

            static {} //allowed static initializers

            static void sm1() {} //allowed static methods

            void im1() {} //allowed instance methods

            Test { //can add invariant validations on compact constructor
                if (age < 0) {
                    throw new IllegalArgumentException();
                }
            }
        }

        record HighSchoolStudent(String name, int age) { // default values on record constructors
            public HighSchoolStudent(String name){
                this(name, 18);
            }
        }

        System.out.println(new HighSchoolStudent("peter"));
        System.out.println(new HighSchoolStudent("peter", 23));
    }
}
