package org.child1.interfaces.defaultstaticinterface;

public class Car implements Brake, Engine {

    @Override
    public void run()
    {
        System.out.println("Running");
    }

}
