package org.child1.polymorphism.overriding.covarientreturntype;


public class Main {
    public static void main(String[] args) {

        Box c= new Weight();
        c.makeobj();
        //we can have more specific obj return types ,
        // but works as dynamic dispatch

        //Covariant return type allows an overridden
        // method to return a subtype of the original method’s return type.
    }
}
