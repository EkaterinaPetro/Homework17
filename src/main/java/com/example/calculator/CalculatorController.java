package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String hello () {
        return calculatorService.hello();
    }

    @GetMapping( "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int sum = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + sum;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        int diff = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + diff;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int work = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + work;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        int work = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + work;
    }
}
