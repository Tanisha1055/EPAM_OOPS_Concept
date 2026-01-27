package org.child1;

import java.util.Arrays;

class Student{
    int roll;
    String name;
    int marks;

    Student()
    {
        this.name="Kunal";
        this.roll=13;
        this.marks=84;
    }

}

public class Main {
    public static void main(String[] args) {

//        Student students[]=new Student[5];
//        System.out.println(Arrays.toString(students));

        Student kunal=new Student();
        System.out.println(kunal.name);
        fun();
    }
    static void fun(){
        Main obj= new Main();
        obj.greeting();
    }
        void greeting()
        {
            System.out.println("Hello!greetings");
        }

        //Object-Oriented Programming (OOP) is a programming style that organizes code into objects,
        //which are instances of classes. Each object represents a real-world entity and contains data
        //(fields or attributes) and behavior (methods or functions).
       //Class:A blueprint for creating objects. It defines the data and behavior.
       //Object:An instance of a class. It has its own values for the data defined in the class.

}