package com.example.demo;
class Parent {
    public void display(String msg){
        System.out.println("Parent"+msg);
    }
}

public class MethodOverriding extends Parent {
    public static void main(String[] args) {
        MethodOverriding methodOverriding = new MethodOverriding();
        methodOverriding.display("Hello");
    }
    public void display(String msg){
        System.out.println("Child "+msg);
    }
}

