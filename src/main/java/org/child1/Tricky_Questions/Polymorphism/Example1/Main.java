package org.child1.Tricky_Questions.Polymorphism.Example1;

class A {}
class B extends A {}
public class Main {
    void show(A a) {
        System.out.println("A");
    }

    void show(B b) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A obj = new B();
        Main t = new Main();
        t.show(obj);
    }
}

//Answer:
//A

//Overloading is compile-time
//Compiler sees reference type = A
//So show(A) is chosen
//same name so think , it is overloading as well .
