package com.example.demo;

public class Dummy {

    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            System.out.print(" " + i);
            if(i % 10 == 0)
                System.out.println();
        }

        number1(10);
        number2(10);
        number3(10);
        number4(10);
    }

    public static void number1(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+j);
            }
            System.out.println();
        }
    }

    public static void number2(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+j);
            }
            System.out.println();
        }

        for(int i=rows-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(""+j);
            }
            System.out.println();
        }
    }

    public static void number3(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+i);
            }
            System.out.println();
        }
    }

    public static void number4(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(""+j);
            }
            System.out.println();
        }
    }
}
