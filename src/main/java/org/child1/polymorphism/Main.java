package org.child1.polymorphism;

public class Main {
    public static void main(String[] args) {
        //Polymorphism means one thing can take many forms. In programming, it lets you use
        //the same method or action for different types of objects. Ex: You can use it to
        //turn on a TV, a fan, or an air conditioner.
        //The button is the same, but what happens depends on the device

        //Types of Polymorphism:
        //Compile-time (Static) Polymorphism:
        //Achieved through method overloading (same method name, different parameters).
        //here basically there is no confusion as by one time seeing you can identify which method
        //is being called (as the method is with diff no. of arg). No double checking, so those kinds
        // are resolved during compile time.
        //Runtime (Dynamic) Polymorphism:
        //Achieved through method overriding (subclass provides specific implementation
        //of a method defined in the superclass or interface).
        //here basically you have to see which obj is there acc to reference type, a d then decide whose
        //method is called (parent's in case of static, and normally we have dynamic dispatch). So we
        //have to do double checking, so we do these during runtime.
    }
}
