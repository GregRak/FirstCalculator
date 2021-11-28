package com.kodilla.firstcalculator;

import org.springframework.boot.SpringApplication;

public class Calculator {


    public double addNumbers(double numberA, double numberB) {
        return numberA + numberB;
    }

    public double subNumbers (double numberA, double numberB){
        return numberA - numberB;
    }
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        double addResult = calculator1.addNumbers(4.32, 2.21);
        System.out.println("Addition result is: " + addResult);

        double subResult = calculator1.subNumbers(9.21, 4.87);
        System.out.println("Subtraction result is: " + subResult);
    }
}
