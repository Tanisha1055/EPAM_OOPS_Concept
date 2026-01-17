package org.child1.inheritence.singleinheritence;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.l+" "+box.h);
        Weight weight= new Weight();
        Weight weight2= new Weight(4,5,6,7);
        System.out.println(weight.h+" "+weight.w);
        System.out.println(weight2.h+" "+weight2.w);
    }
}
