package org.child1.Tricky_Questions.Inheritence.Example1;

class Parent {
    static {
        System.out.println("Parent static");
    }

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static");
    }

    Child() {
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("Child show");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}

//Answer:
//Parent static
//Child static
//Parent constructor
//Child constructor
//Child show

//Class loading → static → instance → constructor → overridden method
