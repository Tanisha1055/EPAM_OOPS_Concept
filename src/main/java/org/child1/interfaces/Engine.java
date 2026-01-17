package org.child1.interfaces;

public interface Engine {
    public void run();
    static void display()
    {
        helper();
        System.out.println("displaying");
    }

    //pvt static can be used inside static function ,
    // which normal pvt method can't so add a benefit

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
}
