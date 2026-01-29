package org.child1.Tricky_Questions.Inheritence.Example4;

class Parent {

    Parent() {
        System.out.println("Parent constructor");
        show();
    }

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {

    int x = 10;

    Child() {
        System.out.println("Child constructor");
    }

    @Override
    void show() {
        System.out.println("Child show(), x = " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
    }
}

//Parent constructor
//Child show(), x = 0
//Child constructor

//Step-by-step execution:
//new Child() is called
//Parent constructor runs first (always)
//Inside Parent() → show() is called
//Dynamic method dispatch happens
//→ Child’s show() is called (not Parent’s)
//BUT:
//Child fields are not yet initialized
//So x is still default value = 0
//Then Child constructor runs
//x becomes 10

//Overridden methods are dispatched at runtime, even when called from constructors.
//Instance variables are not yet initialized when parent constructor runs.

//🚨 This is a Known Java Pitfall
//Calling overridable methods from constructors is dangerous.
//Why?
//Because:
//Child object is not fully constructed
//You may get wrong values / NullPointerException

//Even though the parent constructor is running, the overridden method in the child is invoked
//due to dynamic binding. However, since the child object is not fully initialized, its fields hold
//default values. That’s why x is printed as 0.