package org.child1.deepandshallowcopy;

public class Car {
    int seat;
    int engine;

    public Car() {
        System.out.println("This is cart constructor");
    }

    public Car(int seat, int engine) {
        this.seat = seat;
        this.engine = engine;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
