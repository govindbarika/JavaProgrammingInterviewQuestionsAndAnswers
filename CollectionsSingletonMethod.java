package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSingletonMethod {
    public static void main(String[] args) {
        String[] array = {"1", "2", "4", "2", "1", "2", "3", "1", "3", "4", "3", "3"};
        List list = new ArrayList(Arrays.asList(array));

        list.remove("2");

        list.removeAll(Collections.singleton("2"));

        list.removeAll(new ArrayList<String>(){
            {
                add("1");
            }
        });
        System.out.println(list);
    }
}
