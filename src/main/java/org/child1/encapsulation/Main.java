package org.child1.encapsulation;

public class Main {
    public static void main(String[] args) {
        Box b=new Box(3,4,5);
        b.setW(7);
        System.out.println(b.getH());
        System.out.println(b.getW());

        //Encapsulation is basically data hiding, that is allowing access only
        //through getters and setters, for security , i.e. only valid obj can access
        //the data. Bundling data (fields) and methods (functions) that operate on the
        //data into a single unit (class), and restricting direct access to some of the
        //object's components. Achieved using access modifiers (private, protected, public).
        //Hides the internal state and requires all interaction to be performed through an
        //object's methods .

        //Abstraction: Focuses on what functionality is provided.
        //Encapsulation: Focuses on how data and implementation details are hidden
    }
}
