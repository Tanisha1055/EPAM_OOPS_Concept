package org.child1.Tricky_Questions.Type_Promotion.Example2;

//Primitive Overloading

class Main {
    void show(String s) {
        System.out.println("String");
    }
    void show(Object o) {
        System.out.println("Object");
    }
    public static void main(String[] args) {
        Main t = new Main();
        t.show(null);
        t.show("Venkat");
    }
}



//Overloading prefers more specific types when multiple matches are possible
//t.show(null) passes null, which matches both, but String is more specific than Object
//
//Output: String, String
