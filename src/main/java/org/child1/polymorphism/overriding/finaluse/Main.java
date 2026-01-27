package org.child1.polymorphism.overriding.finaluse;

public class Main {
    public static void main(String[] args) {
        Box c= new Weight(2,4,5);

        //can't override in child class if the method is final
        c.findprint();

        //as final means something that is fixed. So you can't change the behaviour, if you are
        //overriding then you are changing behaviour, so not possible .

    }
}
