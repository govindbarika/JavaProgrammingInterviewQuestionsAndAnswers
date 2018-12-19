package com.example.demo;

 public class Sample {
     public static void main(String[] args) {
         System.out.println("Hello World");
         //System.out.println(-0.0/0.0);
         /*Sample sample =  new Sample();
         sample.m1("Govind");
         sample.m1(new StringBuffer("Govind"));
         sample.m1(null);*/
         String s = null; String s1="Hello";
         //System.out.println(s.equals(s1));
     }

     public void m1(String str){
         System.out.println("String");
     }

     public void m1(StringBuffer strbfr){
         System.out.println("String");
     }


     /*String s= new String();*/

}

class child extends Sample{
     public void m1(String s){
         System.out.println("HEllo");
     }
}
