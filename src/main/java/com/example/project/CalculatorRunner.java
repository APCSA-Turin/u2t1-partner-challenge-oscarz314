package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc1 = new Calculator("Ti84");
        
        //2. call any methods of that class to test
        System.out.println(calc1.performOperation("*", 2, 3));
        System.out.println(calc1.divisibleBy(2, 5));
        System.out.println(calc1.coordinatePair(4, 5));
        System.out.println(calc1.absoluteValue(2, 234));
        System.out.println(calc1.info());


    }
}
