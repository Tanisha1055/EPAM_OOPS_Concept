package org.child1.encapsulation;

public class Box {
    private int h;
    private int b;
    private int w;
    public void setH(int h)
    {
        this.h=h;
    }
    public int getH()
    {
        return h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public Box(int h, int b, int w) {
        this.h = h;
        this.b = b;
        this.w = w;
    }
}
