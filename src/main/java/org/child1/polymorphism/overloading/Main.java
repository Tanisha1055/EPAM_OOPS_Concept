package org.child1.polymorphism.overloading;

public class Main {
    public static void main(String[] args) {
        Box b=new Box();
        Box c=new Box();
        b.findmeasure(3,4);
        c.findmeasure(5,6,7);
        System.out.println(b.h);
        System.out.println(c.h);
    }
}
