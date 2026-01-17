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

}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

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


}