package org.child1.polymorphism.overriding.methodhiding;

public class Main {
    public static void main(String[] args) {
        Box b= new Weight();
        b.findprint();
        //calling parent's as sees ref,
        // so parent's method is hidden,
        // as static depends on class ,
        // and not object so won't see the runtime but compile time
    }
}
