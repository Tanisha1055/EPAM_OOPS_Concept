package org.child1.abstraction;

public class Main {
    public static void main(String[] args) {
        Box b=new Weight();
        b.calmeasure();
        b.heythere();

        //Abstraction is basically showing the essential details according to the user's
        //view. (Like I am a customer so why will I see the internally factory detail,
        //I will just be aware of deliver as a dummy method , that does the job
        //, but if I am the owner I should be aware , so abstraction depends from
        //person to person). It is used for method hiding , that is like add method ,
        //returns you the addition of the item, doesn't show you how it is added .
        //Hiding complex implementation details and showing only the necessary
        //features of an object. Achieved using abstract classes, interfaces,
        //and by exposing only relevant methods. Simplifies complexity by exposing
        //only what is necessary.
        //Encapsulation is a technique that helps achieve abstraction .
        //By encapsulating data and hiding implementation details,
        // you provide an abstract interface to the user . Encapsulation enables
        // abstraction by hiding the internal details and exposing only what is necessary.
        //You can have encapsulation without abstraction (e.g., hiding fields but exposing all
        // methods), but effective abstraction usually relies on encapsulation .

        // Abstraction: Only exposes deposit and withdraw, not how balance is stored
        // class BankAccount {
        //    private double balance; // Encapsulation: balance is private
        //
        //    public void deposit(double amount) { /* ... */ }
        //    public void withdraw(double amount) { /* ... */ }
        //    // No direct access to balance from outside
        // balance is encapsulated (private).
        // Only essential operations are exposed (abstraction).
        //}

        //we can have abstraction without encapsulation, it's fine.
        //we can have constructors in abstract classes, as we can have some properties
        //(methods) initialised in the abstract classes, and the further can be specified
        //the extending classes, so during object creation, the abstract class also specifies
        //the implementation, as it can have instance methods, so it can have instance block
        //which runs to initialise instance feilds during obj creation (as abstract would initialise
        //that much portion which is specified in the abstract class , as the extending class
        //only overrides the abstract methods, and not the concrete methods) .

        }
}
