package org.child1.polymorphism.overloading.typepromotion;
class Print{
    void printfucn(int i, float j)
    {
        System.out.println("This is integer first arg");
    }
    void printfucn(double i, float j)
    {
        System.out.println("This is double first arg");
    }
};
public class Main {
    public static void main(String[] args) {
        Print pr=new Print();
        pr.printfucn(2,5.0f);
        pr.printfucn(5.0,5.0f);
        pr.printfucn(2f,5.0f);
    }

//    in type promotion more specific is preferred over more generic
//    in type promotion widening(int->long) is preferred over boxing(int->Integer)

    //Type promotion (also called implicit type conversion or automatic type conversion) is a concept
    //in Java where a value of a smaller data type is automatically converted to a larger data type
    //during operations, without explicit casting by the programmer. Especially when the matching one is
    //not found.
    //byte → short → int → long → float → double
}
