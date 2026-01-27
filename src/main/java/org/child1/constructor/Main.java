package org.child1.constructor;

public class Main {
    public static void main(String[] args) {
       Dog dog=new Dog(11,5);
       Dog dog2=new Dog(11,11);
       Dog dog3=new Dog(2,3);
    }

    //constructor is used for object initialisation and validation(you can add that the
    //name feild can't be null checks and all in constructor), so when you do new for
    //object creation, the constructor get's called implicitly. There is a default constructor
    //specified with every class. But when you explicty write some constructor, that gets
    //erased, so if you have written constructor with parameters , then tried constructor
    //with no args(default), it won't work . (You can see that even in parent if you super()
    //with no args, it will work , as there is one default constructor) .

    //constructor is concerned with the particular class only, doesn't participate in
    //inheritence, i.e. you won't be able to override it (like final, but we don't
    //do it final as it is implictly understood , so why to write), and it is concerned with
    //particular obj so , i.e every obj will have this , so it can;'t be static .

}
