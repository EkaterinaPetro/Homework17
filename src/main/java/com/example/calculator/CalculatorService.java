package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello () {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int minus(int num1, int num2) {
        int diff = num1 - num2;
        return diff;
    }

    public int multiply(int num1, int num2) {
        int work = num1 * num2;
        return work;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        int work = num1 / num2;
        return work;
    }
}
