package org.child1.Tricky_Questions.Type_Promotion.Example1;


public class Main {
    void show(int i) {
        System.out.println("int");
    }

    void show(Integer i) {
        System.out.println("Integer");
    }

    void show(long i) {
        System.out.println("long");
    }

    void show(int... i) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        Main t = new Main();
        t.show(10);
    }
}

//Which method is called and why?
//int

//Java follows:
//1.Exact match
//2.Widening
//3.Boxing
//4.Varargs

//Varargs is basically indicating that you can pass variable amount of arguments(very generalised)