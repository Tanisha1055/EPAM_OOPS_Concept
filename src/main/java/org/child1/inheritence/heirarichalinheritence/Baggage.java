package org.child1.inheritence.heirarichalinheritence;

public class Baggage extends Box{
    int bag;
    public Baggage(int l, int h, int b, int bag) {
        super(l, h, b);
        this.bag = bag;
        System.out.println("Bag is called");
    }
}
