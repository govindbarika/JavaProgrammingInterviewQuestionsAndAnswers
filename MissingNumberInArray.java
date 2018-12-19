package com.example.demo;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,2,6,7};
        int n =7;
        System.out.println(findMissingNumber(numbers, n));
    }

    public static int findMissingNumber(int[] input, int n){
        int sum = 0;
        for (int i : input){
            sum+=i;
        }
        int total = n*(n+1)/2;
        return total-sum;
    }
}
