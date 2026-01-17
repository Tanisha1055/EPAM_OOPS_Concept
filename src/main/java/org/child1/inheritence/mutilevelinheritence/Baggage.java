package org.child1.inheritence.mutilevelinheritence;

public class Baggage extends Weight {
    int bag;

    public Baggage(int bag) {
        this.bag = bag;
        System.out.println(b);
    }

    public Baggage(int l, int h, int b, int w, int bag) {
        super(l, h, b, w);
        this.bag = bag;
        System.out.println(h);
    }

    public int getBag() {
        return bag;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }
}
