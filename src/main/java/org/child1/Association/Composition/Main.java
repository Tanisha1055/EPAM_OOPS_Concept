package org.child1.Association.Composition;

public class Main {
    public static void main(String[] args) {
        //This is a strong HAS-A relationship, that means, if you delete one obj of the class,
        //the other object also gets deleted. (the class contains another class object). You do
        //this by creating another class's object inside of another class, so the class is deleted,
        //simultanously the obj of another class also gets deleted, as the obj exists inside of the
        //other class only . So the object of one class , can't exist without the other .
        //Example , like heart can't exist without human , similarly engine can't exist without
        //car .

        Car car = new Car("V8");
        car.startCar();
        // When car is destroyed, engine is also destroyed

    }
}
