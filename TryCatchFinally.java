package com.example.demo;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(5*0.1 == 0.5);
        System.out.println(printMsg());
    }
    public static int printMsg(){
        try{
            System.out.println("try");
            throw new Exception();
            //return 1;
        }catch(Exception e){
            System.out.println("Catch");
            return 2;
        }finally {
            System.out.println("Finally");
            return 3;
        }
    }
    public static void main(Integer[] integers){
        //return 0;
    }


}
/*try
        Catch
        Finally
        3*/
