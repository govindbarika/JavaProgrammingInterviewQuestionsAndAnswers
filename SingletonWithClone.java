package com.example.demo;

class SuperClass implements Cloneable {
    int i = 10;

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

// Singleton class
class CSingleton extends SuperClass
{
    // public instance initialized when loading the class
    public static CSingleton instance = new CSingleton();

    private CSingleton()
    {
        // private constructor
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}

public class SingletonWithClone
{
    public static void main(String[] args) throws CloneNotSupportedException {
        CSingleton instance1 = CSingleton.instance;
        CSingleton instance2 = (CSingleton) instance1.clone();
        System.out.println("instance1 hashCode:- "  + instance1.hashCode());//356573597
        System.out.println("instance2 hashCode:- "  + instance2.hashCode());//1735600054
        //After clone implementaion -
        // Exception in thread "main" java.lang.CloneNotSupportedException
        //	at com.example.demo.CSingleton.clone(SingletonWithClone.java:28)
        //	at com.example.demo.SingletonWithClone.main(SingletonWithClone.java:36)
    }
}