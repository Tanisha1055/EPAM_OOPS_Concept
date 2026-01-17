package org.child1.polymorphism.overriding.superuse;


public class Main {
    public static void main(String[] args) {
        Box c= new Weight(2,4,5);

        //to use only super() ,is used in constructor to call the parent's constructor
        // if want to call the parent's method particular one
        //use super.method name , inside child class
        c.findprint();
    }
}
