package org.child1.Tricky_Questions.Polymorphism.Example2;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println(p.x);
        System.out.println(c.x);
    }
}

//Answer:
//10
//20

//Variables do NOT participate in polymorphism
//Accessed using reference type
//Methods are polymorphic, variables are not.

