package org.child1.Tricky_Questions.Inheritence.Example5;

class Parent {
    Parent() {
        display();
    }

    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {

    String name = "Java";

    void display() {
        System.out.println(name.length());
    }
}

public class Main {
    public static void main(String[] args) {
        new Child();
    }
}

//Answer:
//❌ NullPointerException
//Because:
//name is not initialized yet (still null)
//name.length() → NPE

//Never call overridable methods from constructors.