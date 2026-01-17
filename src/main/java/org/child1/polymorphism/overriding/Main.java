package org.child1.polymorphism.overriding;

public class Main {
    public static void main(String[] args) {
//        1st way
        Box b=new Box();
        Weight w=new Weight();
        w.findprint();
//        2nd way
        Box c= new Weight();
        c.findprint();
    }
}
