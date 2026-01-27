package org.child1.polymorphism.overriding.dynamicdispatch;

public class Main {
    public static void main(String[] args) {
        Box b= new Weight();
        b.findprint();
        //called the child's dynamic deciding
        //as at run time dynamically deciding which method to call based on the obj type .
        //this will see at run-time that the ref is pointing to which obj type, as in reality we have
        //have obj of the child class and actually exists, we have made obj of that. But at compile time
        //we see that whether it is eligible for the ref of the parent to point towards child obj , is it
        //true as due to IS-A relationship, so since child is a parent, so parent can point to child .
        //but at run time we decide which method to call ,as child obj exists in real ,so calls the child's
        //method if it is visible by the parent ref (that is if it overrides the parent methods, so the
        //overriden methods of the parent), if it is brand new to child, then no use as not visible by the
        //parent class only).
    }
}
