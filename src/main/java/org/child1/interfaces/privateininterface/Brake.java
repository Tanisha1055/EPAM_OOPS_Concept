package org.child1.interfaces.privateininterface;

public interface Brake {

    default void show()
    {
        System.out.println("showing");
    }
    public void run();
}
