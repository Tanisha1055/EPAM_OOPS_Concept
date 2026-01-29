package org.child1.Tricky_Questions.AutoboxingAndTypeCasting.Example1;

public class Main {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;

        Integer x = 200;
        Integer y = 200;

        System.out.println(a == b);
        System.out.println(x == y);

    }
}

//Answer:
//true
//false

//👉 Why:
//Java caches -128 to 127