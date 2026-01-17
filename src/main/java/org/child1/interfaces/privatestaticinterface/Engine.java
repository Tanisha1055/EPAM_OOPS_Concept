package org.child1.interfaces.privatestaticinterface;

public interface Engine {
    public void run();
    static void display()
    {
        System.out.println("displaying");
    }
    private static void helper(){
        System.out.println("This is helping");
    }
//    here helper which is a private method is a utility class .
//    so we don't have to do redundant implementation
//    in the child classes inheriting this,
//    which will have it as a nested function inside another implementing function
//    (so for every nested function (in order to implement the outer function)
//    we would have to do repeated implementation of the helper function .

    default void show()
    {
        helper();
        System.out.println("showing");
    }

    public static void newstatic()
    {
        helper();
        System.out.println("This is new static");
    }

//    private static are specially for static methods (utlity function)
}
