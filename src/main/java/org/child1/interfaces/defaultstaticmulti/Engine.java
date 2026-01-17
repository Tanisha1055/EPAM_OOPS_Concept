package org.child1.interfaces.defaultstaticmulti;

public interface Engine {
    public void run();
    static void display()
    {
        System.out.println("displaying");
    }
    default void show()
    {
        System.out.println("showing");
    }
}
