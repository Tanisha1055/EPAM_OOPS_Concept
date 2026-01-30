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


//Java Object Construction & Initialization Rules:

//1. Memory Allocation
//When you create an object (new Child()), memory is allocated for all fields (including inherited ones),
//and all fields are set to their default values (0 for int, null for objects, false for boolean, etc.).

//2. Field Initializers and Instance Initializer Blocks
//Field initializers and instance initializer blocks are executed in the order they appear in the class,
//after the parent constructor has run.

//3. Constructor Execution Order
//Parent (superclass) constructor runs first, then the child (subclass) constructor.
//If you don’t explicitly call super(...) in the child constructor, Java inserts a call to the
//no-argument parent constructor automatically.

//4. Static Initializers
//Static fields and static initializer blocks are executed once when the class is first loaded, in the order they appear.