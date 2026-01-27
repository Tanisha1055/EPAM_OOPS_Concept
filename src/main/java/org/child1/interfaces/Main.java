package org.child1.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();

        car.brake();
    }

    //Interface tells you the contract that the implementing class has to implement.
    //It just specifies what methods are there and not what they will do, provides a
    //generalised set of methods. It provides 100% abstraction.
    //With interface, multiple inheritance is possible. As the class can implement
    //2 interface having the same method name, as there is no implementation provided
    //so it will not get confused, what to implement (so solves the diamond problem).
    //With java 8 you can add default and static methods, default is added to provide
    //backward compatibility, i.e. if the implementing classes (there could be many) are
    //inheriting the methods of the interface, and later you want to introduce some new
    //methods in the future, you don't want to keep on adding the implementation in all
    //the inheriting (implementing) classes, especially if you know the implementation is
    //constant, like walk. So you can add that default method, so all the implementing
    //classes can auto implement them. Also in java 9 we have private and private static
    //methods which acts as helper function. You can't make obj of interface (as they are
    //not visible to the outside classes). static as when you want to group some particular
    //properties related to the class(as you can't override them).
    //You can't have constructors inside interface.(as constructors used to initialise
    //some obj, so need to have instance feilds for that, and interface is common for all
    //so it doesn't have instance feilds, which is specified to just one particular instance).
}
