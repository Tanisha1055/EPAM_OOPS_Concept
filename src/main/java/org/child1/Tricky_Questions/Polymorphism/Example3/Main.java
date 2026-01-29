package org.child1.Tricky_Questions.Polymorphism.Example3;

class Parent {
    Parent() {
        show();
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    int x = 10;

    void show() {
        System.out.println("Child show: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        new Child();
    }
}


//Answer:
//Child show: 0

//Parent constructor calls show()
//Due to runtime polymorphism, Child’s show() is called
//But Child fields not initialized yet → x = 0 (default)
//Never call overridable methods from constructors.

//Step	What Happens?
//1	Static fields/blocks (Parent, then Child)
//2	Instance fields/blocks (Parent, default values)
//3	Parent constructor
//4	Instance fields/blocks (Child, default values)
//5	Child constructor

//Instance blocks for assigning the values to the instance variables, from default values
