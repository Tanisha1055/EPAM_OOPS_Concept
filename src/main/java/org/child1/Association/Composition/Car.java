package org.child1.Association.Composition;

// Car class (whole)
public class Car {
    private Engine engine; // Composition: Car owns Engine

    public Car(String engineType) {
        // Engine is created inside Car, Car manages Engine's lifecycle
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        System.out.println("Car is starting...");
        engine.start();
    }
}
