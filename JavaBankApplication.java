package com.example.javabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBankApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaBankApplication.class, args);
        System.out.println("Hello World!");
        for (int i = 1; i <= 5; i++){
            System.out.println("i = " + i);
        }
    }


}
