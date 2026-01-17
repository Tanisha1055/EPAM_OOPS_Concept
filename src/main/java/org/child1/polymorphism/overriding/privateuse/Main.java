package org.child1.polymorphism.overriding.privateuse;



public class Main {
    public static void main(String[] args) {
//        Box c= new Weight();
//        c.findprint();
//        this will have error as the ref type is parent and
//        we see whether we acn access it por not by the ref type
//        since in parent class it is pvt , so even the parent class obj
//        outside the class can't access it


        Weight w=new Weight();
        w.findprint();
        //this method is new separate from parent one
//        as not visible to subclass only
    }
}
