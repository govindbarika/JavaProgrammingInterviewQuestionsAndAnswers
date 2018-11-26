package com.example.demo;

public class CustomException extends RuntimeException {

    CustomException(String message){
        super(message);
    }
}
