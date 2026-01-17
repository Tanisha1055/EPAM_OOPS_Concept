package org.child1.interfaces.defaultstaticmulti;



public class Car implements Brake, Engine {

    @Override
    public void run()
    {
        System.out.println("Running");
    }
    @Override
    public void show()
    {
        System.out.println("this is showing");
    }
}
