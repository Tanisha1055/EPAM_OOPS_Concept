package org.child1.polymorphism.overriding.dynamicdispatch;

public class Main {
    public static void main(String[] args) {
        Box b= new Weight();
        b.findprint();
        //called the child's dynamic deciding
    }
}
