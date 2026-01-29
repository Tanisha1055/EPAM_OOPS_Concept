package org.child1.Tricky_Questions.Inheritence.Example2;

class Parent {
    static void m1() {
        System.out.println("Parent static");
    }

    void m2() {
        System.out.println("Parent non-static");
    }
}

class Child extends Parent {
    static void m1() {
        System.out.println("Child static");
    }

    void m2() {
        System.out.println("Child non-static");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.m1();
        obj.m2();
    }
}

//Answer:
//Parent static
//Child non-static

//m1() → static → resolved by reference type → Parent
//m2() → instance → resolved by object type → Child
