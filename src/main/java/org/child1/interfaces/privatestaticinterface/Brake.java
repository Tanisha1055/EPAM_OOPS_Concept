package org.child1.interfaces.privatestaticinterface;

public interface Brake {

    default void show()
    {
        System.out.println("showing");
    }
    public void run();
}
