package org.child1.Tricky_Questions.Type_Promotion.Example3;

//Overloading: Type Promotion


class Test {
    void show(int a, long b) {
        System.out.println("int, long");
    }
    void show(long a, int b) {
        System.out.println("long, int");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10, 20);
    }
}


//Java doesn’t know which method to use, should it convert the first int to long or long to int?
//so,compile time error.

