package org.child1.Tricky_Questions.Interface.Example2;

interface A {
    default void show() {
        System.out.println("A");
    }
}

class B implements A {
    public void show() {
        System.out.println("B");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}

//Answer:
//B
//Class implementation always overrides interface default methods.
//Default is the generalised one, if more specific implementation is there then that should be executed


