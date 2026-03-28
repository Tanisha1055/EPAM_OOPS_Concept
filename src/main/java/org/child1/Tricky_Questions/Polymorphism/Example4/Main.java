package org.child1.Tricky_Questions.Polymorphism.Example4;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        System.out.println(arr1.equals(arr2));
    }
}


//Output:
//false


//Reason:
//Arrays (int[], Object[]) do NOT override equals() method .