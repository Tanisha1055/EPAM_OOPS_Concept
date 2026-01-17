package org.child1.inheritence.mutilevelinheritence;


public class Weight extends Box {
    int w;

    public Weight() {
        w=-1;
    }

    public Weight(int l, int h, int b, int w) {
        super(l, h, b);
        this.w = w;
    }
}
