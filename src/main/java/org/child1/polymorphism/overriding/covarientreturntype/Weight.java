package org.child1.polymorphism.overriding.covarientreturntype;



public class Weight extends Box {
    @Override
    public void findprint()
    {
        System.out.println("This is Weight class");
    }
    Weight makeobj()
    {
        System.out.println("Weight obj is created");
        return new Weight();

    }
}
