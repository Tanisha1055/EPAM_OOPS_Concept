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
}
