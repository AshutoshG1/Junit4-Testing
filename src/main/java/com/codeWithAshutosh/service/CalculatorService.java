package com.codeWithAshutosh.service;

public class CalculatorService {
    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static int subTwoNumbers(int a, int b){
        return a-b;
    }

    public static int mulTwoNumbers(int a, int b){
        return a*b;
    }

    public static int divTwoNumbers(int a, int b){
        return a/b;
    }

    public static int sumAnyNumbers(int...numbers){
        int sum = 0;
        for (int n : numbers){
            sum = sum + n;
        }
        return sum;
    }
}
