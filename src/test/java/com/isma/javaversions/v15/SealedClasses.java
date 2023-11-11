package com.isma.javaversions.v15;

public class SealedClasses {

    interface Shape{ }
    class Circle implements Shape{ }
    class Square implements Shape{ }


    sealed interface Person permits Student, Teacher{ }
    final class Student implements Person{ }
    final class Teacher implements Person{ }
}
