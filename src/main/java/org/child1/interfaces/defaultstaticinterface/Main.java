package org.child1.interfaces.defaultstaticinterface;


public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.run();
        car.show();
        Engine.display();
//        only by interface name you can call static method
//        as static method are not inherited to the implementing class.
//        this is a designer's choice to keep the static method as a
//        utility(helper) method
//        so this also resolves the issue of multiple inheritence so less error prone
    }
}
