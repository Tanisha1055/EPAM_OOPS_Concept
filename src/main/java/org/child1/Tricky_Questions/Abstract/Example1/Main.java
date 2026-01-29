package org.child1.Tricky_Questions.Abstract.Example1;

public class Main {
    public static void main(String[] args) {
        abstract class A {
            abstract private void run();
        }

    }
}

//Answer:
//Illegal combination of modifiers
//abstract → must be overridden
//private → cannot be overridden
//An abstract method must be accessible to subclasses.