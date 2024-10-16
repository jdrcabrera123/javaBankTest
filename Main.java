package com.example.javabank;

public class Main {
    public static void main(String[] args) {
       try {
           int result = 10 /0;
           System.out.println(result);
       }catch (ArithmeticException e) {
           System.out.println("It can't divide by zero");
       }
    }
}
