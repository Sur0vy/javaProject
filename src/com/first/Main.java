package com.first;

import com.first.humans.Student;
import com.first.common.Course;

public class Main {

    public static double getCircleArea(double radius){
        double pi = 3.14;
        return(pi * radius * radius);
    }

    public static void main(String[] args){

        System.out.println("Hello java_1!");
        System.out.println("Hello java_2!");
        System.out.println("Hello java_3!");

        Student myStudent = new Student();
        myStudent.name = "Dmitry";
        myStudent.course = new Course();
        myStudent.course.name = "Java course";
        myStudent.age = 26;
        myStudent.sayHello();

        Student mStudent = new Student();
        mStudent.course = new Course();
        mStudent.sayHello();

        System.out.println("hello! First commit!");

        System.out.println(getCircleArea(2.2));




/*
* 00000000 - byte - 8b
* 00000110
* 0*2^0 + 1*2^1 + 1*2^2 + ... = 0 + 2 + 4 = 6
*
* 01101100
* 2^2 + 2^3 + 2^5 + 2^6 = 4 + 8 + 32 + 64 = 108
*
* byte  - 8b
* short - 16b граничные возможности -32 768...32 767
* int   - 32b граничные возможности -2^31...2^31-1
* long  - 64b граничные возможности -2^63...2^63-1
* float - 32b
* double - 64b
* char
* литералы
* Sectrion 1 Section 2
* http://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html
* list of java keywords
* как из консоли компилить в другую папку
*/


    }

}