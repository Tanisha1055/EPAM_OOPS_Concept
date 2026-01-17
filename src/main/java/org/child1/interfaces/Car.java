package org.child1.interfaces;

public class Car implements Brake, Engine {

    @Override
    public void run()
    {
        System.out.println("Running");
    }
    @Override
    public void brake(){
        System.out.println("This is a brake");
    }

}
