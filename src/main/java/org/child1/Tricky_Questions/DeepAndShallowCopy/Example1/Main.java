package org.child1.Tricky_Questions.DeepAndShallowCopy.Example1;

class Address {
    String city;
}

class Person {
    String name;
    Address address;
}

public class Main {
    public static void main(String[] args) {
        Address a = new Address();
        a.city = "Delhi";

        Person p1 = new Person();
        p1.name = "A";
        p1.address = a;

        Person p2 = p1; // shallow

        p2.address.city = "Mumbai";

        System.out.println(p1.address.city);
    }
}

//Answer:
//Mumbai

//Why:

//Both p1 and p2 point to same object

//📌 Interview line:
//“Shallow copy copies references, deep copy copies actual objects.”