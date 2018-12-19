package com.example.demo;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.ObjectInput;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutput;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SSingleton implements Serializable
{
    // public instance initialized when loading the class
    public static SSingleton instance = new SSingleton();

    private SSingleton()
    {
        // private constructor
    }

    //Overcome serialization issue:- To overcome this issue, we have to implement method readResolve() method.
    public Object readResolve()  {  //1989780873
        return instance;
    }
}


public class SingletonWithSerialization
{

    public static void main(String[] args)
    {
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            )
        {
            SSingleton instance1 = SSingleton.instance;

            out.writeObject(instance1);


            // deserailize from file to object

            SSingleton instance2 = (SSingleton) in.readObject();


            System.out.println("instance1 hashCode:- " + instance1.hashCode()); //1989780873
            System.out.println("instance2 hashCode:- " + instance2.hashCode()); //1480010240
            //After readResolve() method implementaion - 1989780873 for both objects


        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}