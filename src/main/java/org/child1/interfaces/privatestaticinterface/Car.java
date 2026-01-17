package org.child1.interfaces.privatestaticinterface;



public class Car implements Brake, Engine {

    @Override
    public void run()
    {
        System.out.println("Running");
    }
    @Override
    public void show()
    {
        Engine.super.show();
    }

//    default methods are not static method , so they are non-static methods.
//    so they should be called on instance .
//    hence we use the super keyword .

    public void callstatic()
    {
        Engine.newstatic();
//        as static so you can call by interface name
//        (as static so Interface name (direct class name you can call)


    }

}
