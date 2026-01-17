package org.child1.polymorphism.overriding.finaluse;

public class Box {
    int b;
    int h;

    public Box(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public final void findprint()
    {
        System.out.println("This is Box class");
    }
}
