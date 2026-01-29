package org.child1.Tricky_Questions.Inheritence.Example3;

class A {
    {
        System.out.println("A instance block");
    }
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    {
        System.out.println("B instance block");
    }
    B() {
        System.out.println("B constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        new B();
    }
}

//Answer:
//A instance block
//A constructor
//B instance block
//B constructor

