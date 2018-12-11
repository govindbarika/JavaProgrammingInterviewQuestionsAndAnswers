package com.example.demo;

import com.sun.deploy.net.HttpResponse;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        reverseArray(array);
    }

    public static void reverseArray(int[] arr){

        int middle = arr.length/2;
        int j = arr.length-1;
        //if(arr.length>2) throw new CustomException("Hey maintain Array with two alues");
        for (int i=0;i<middle;i++,j--){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        System.out.println(Arrays.toString(arr));

        //output is : [11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
    }
}
