package com.example.demo;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String args[]){
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        System.out.println("The prime factors are :");
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }


//        Enter a number ::
//        50
//        The prime factors are :
//        2
//        5
//        5
    }
}