package org.child1.Tricky_Questions.AutoboxingAndTypeCasting.Example2;

public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        int b = 10;

        System.out.println(a == b);

    }
}

//Answer:
//Output: true

//👉 Why:
//Unboxing happens → 10 == 10
