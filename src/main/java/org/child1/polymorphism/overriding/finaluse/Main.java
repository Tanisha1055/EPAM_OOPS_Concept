package org.child1.polymorphism.overriding.finaluse;




public class Main {
    public static void main(String[] args) {
        Box c= new Weight(2,4,5);

        //can't override in child class if the method is final
        c.findprint();
    }
}
