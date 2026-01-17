package org.child1.polymorphism.overloading;

public class Box {
    int h;
    int l;
    int b;
    public void findmeasure(int h, int l)
    {
        this.h=h;
        this.l=l;
    }
    public void findmeasure(int h, int l, int b)
    {
        this.h=h;
        this.l=l;
        this.b=b;
    }
}
