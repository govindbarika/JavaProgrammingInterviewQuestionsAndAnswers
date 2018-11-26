package com.example.demo;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapWithNullKeys {

    public static void main(String[] args) {
        HashMap<Object, String> hashMap = new HashMap();
        hashMap.put(null, "Govind");
        hashMap.put(null, "Barika");
        hashMap.put(null, "Hari");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(3, "Four");

        System.out.println("Null key value is " + hashMap.get(null));
        System.out.println("Null key value is " + hashMap.get(3));

        Set<String> set = new HashSet();
        set.add("1");
        set.add(null);
        set.add(null);

        System.out.println("Set values : " + set.toString());



    }
}
