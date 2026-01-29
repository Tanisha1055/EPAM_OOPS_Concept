package org.child1.Tricky_Questions.AutoboxingAndTypeCasting.Example3;

public class Main {
    public static void main(String[] args) {
        double d = 10.5;
        int i = (int) d;
        System.out.println(i);

    }
}

//Answer:
//Output: 10

//👉 Interview line:
//“Narrowing casting truncates decimal, no rounding.”