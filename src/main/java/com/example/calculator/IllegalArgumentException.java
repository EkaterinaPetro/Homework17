package com.example.calculator;

public class IllegalArgumentException extends RuntimeException{
    public IllegalArgumentException() {
        super("Делить на 0 нельзя");
    }
}
