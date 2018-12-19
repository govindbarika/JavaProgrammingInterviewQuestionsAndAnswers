package com.example.demo;


 class HelloWorld1 {
    String str;
    HelloWorld1(){

    }
    HelloWorld1(String str){
        this.str = str;
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
public class ChildHelloWorld extends HelloWorld1 {

}
