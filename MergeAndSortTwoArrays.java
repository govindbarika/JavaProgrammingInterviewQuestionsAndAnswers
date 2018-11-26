package com.example.demo;

import java.util.Arrays;

public class MergeAndSortTwoArrays {

    public static void main(String[] args) {
        int[] a = {3,5,2,8, 10,200,40,55,2000};
        int[] b = {7,1,6,20,60};
        mergeTwoArrays(a,b);
    }

    public static void mergeTwoArrays(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int i=0, j=0, k=0;
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        //Arrays.sort(c);
        //Bubble sort
        for(int x=0;x<c.length-1;x++){
            for(int y=0;y<c.length-1-x;y++){
                if(c[y+1]<c[y]){
                    int temp = c[y];
                    c[y]=c[y+1];
                    c[y+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));//[1, 2, 3, 5, 6, 7, 8, 10, 20, 40, 55, 60, 200, 2000]

    }
}
