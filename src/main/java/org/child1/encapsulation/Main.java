package org.child1.encapsulation;

public class Main {
    public static void main(String[] args) {
        Box b=new Box(3,4,5);
        b.setW(7);
        System.out.println(b.getH());
        System.out.println(b.getW());
    }
}
