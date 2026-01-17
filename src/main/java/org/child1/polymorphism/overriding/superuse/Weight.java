package org.child1.polymorphism.overriding.superuse;

public class Weight extends Box {
    int w;

    public Weight(int b, int h,int w) {
        super(b,h);
        this.w = w;
    }

    @Override

    public void findprint()
    {
        super.findprint();
        System.out.println("This is Weight class");
    }
}
