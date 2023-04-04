package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String hello () {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(int num1, int num2) {
        int diff = num1 - num2;
        return num1 + " - " + num2 + " = " + diff;
    }

    public String multiply(int num1, int num2) {
        int work = num1 * num2;
        return num1 + " * " + num2 + " = " + work;
    }

    public String divide(int num1, int num2) {
        int work = num1 / num2;
        return num1 + " / " + num2 + " = " + work;
    }
}
