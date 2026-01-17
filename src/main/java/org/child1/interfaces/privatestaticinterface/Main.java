package org.child1.interfaces.privatestaticinterface;

public class Main {
    public static void main(String[] args) {
       Car car= new Car();
       car.run();
       car.show();
       Engine.newstatic();
//       you can directly call by interface name

       car.callstatic();

//       you can use car class obj to call that method which
//       is calling that interface method by the interface name

    }
}
