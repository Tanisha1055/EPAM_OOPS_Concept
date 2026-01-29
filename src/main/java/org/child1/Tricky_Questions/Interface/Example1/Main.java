package org.child1.Tricky_Questions.Interface.Example1;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class Main implements A, B {
    public static void main(String[] args) {
        new Main().show();
    }

    //Override with calling specifically exact one , otherwise error as 2 same default implementation
    //Compile-time error: Duplicate default methods

    @Override
    public void show() {
        A.super.show();
    }
}

