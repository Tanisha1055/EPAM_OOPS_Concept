package org.child1.polymorphism.overriding.covarientreturntype;

public class Box {
    int b;
    int h;
    public void findprint()
    {
        System.out.println("This is Box class");
    }
    Box makeobj()
    {
        System.out.println("Box obj is created");
        return new Box();

    }
}
