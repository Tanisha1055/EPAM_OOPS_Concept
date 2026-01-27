package org.child1.polymorphism.overriding.methodhiding;

public class Main {
    public static void main(String[] args) {
        Box b= new Weight();
        b.findprint();
        //calling parent's as sees ref,
        // so parent's method is hidden,
        // as static depends on class ,
        // and not object so won't see the runtime but compile time

        //here the method hiding means, since static is resolved at compile time and belongs to the
        //class, so whoever class ref calls it, it is only gonna be called no matter what , so the
        //rest of the method is hidden as not getting called .

        //similarly you can't override static, as static is defined for the class , you can't change
        //that. As static belongs to the class, and overriding depends on obj, (which static doesn't)
        //so static is resolved at compile time (as we know which it belongs to, which is constant)
        //and overriding is resolved during runtime based on the obj's type.
        //similarly, if the child has static method , with the same method signature then it hides
        //the parent's method .
    }
}
