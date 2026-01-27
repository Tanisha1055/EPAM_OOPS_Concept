package org.child1.deepandshallowcopy;

public class Main {
    public static void main(String[] args) {
        Car c = new Car(2, 5);
        Car c2 = c;
//        shallow copy
//        changes done by this reference is reflected to the original
//        we are directly copying everything to the child
        c2.setEngine(4);
        System.out.println("og: "+c2.getEngine());
        System.out.println("new :"+c.getEngine());
//        reset to compare again
        c.setEngine(5);
        Car c3=new Car();
        c3.setSeat(c.getSeat());
        c3.setEngine(c.getEngine());
//        deep copy
//        in this we are making a new object and copying everything manually
//        so the ref variable is pointing to a different loc in mem.
        c3.setEngine(4);
        System.out.println("og: "+c3.getEngine());
        System.out.println("new :"+c.getEngine());

        //In shallow, only primitives are copied, objects are referenced (so changes in
        //the copied object is reflected in the og obj)
        //In deep copy every thing is copied , primitives and obj , so changes in one is
        //not reflected in the other . (Done by creating a new obj , by the new keyword
        //and manually copying the obj ) .
    }
}
