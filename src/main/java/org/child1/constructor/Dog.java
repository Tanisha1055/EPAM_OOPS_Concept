package org.child1.constructor;

public class Dog {
    int a;
    int b;
    public Dog() {
        a = -1;
        b = -1;
    }
    public void seta (int a)
    {
        if(a>10){
        this.a=a;
        }else{
           throw new IllegalArgumentException("The value of a should be greater than 10");
        }
    }
    public void setb(int b)
    {
        if(b>10){
        this.b=b;
        }else{
           throw new IllegalArgumentException("The value of b should be greater than 10");
        }
    }

    public int geta()
    {
        return a;
    }
    public int getb()
    {
        return b;
    }
    public Dog(int a,int b)
    {
        seta(a);
        setb(b);
        System.out.println("Value of a "+geta());
        System.out.println("Value of b "+getb());
    }

}
