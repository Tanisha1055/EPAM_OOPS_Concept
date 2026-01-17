package org.child1.interfaces.defaultstaticinterface;

public interface Engine {
    public void run();
    static void display()
    {
        System.out.println("displaying");
    }

}
