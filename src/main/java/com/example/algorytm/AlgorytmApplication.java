package com.example.algorytm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgorytmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorytmApplication.class, args);

        int a = 352766;
        int b = 412609;

        while(a != b){
            if (a > b) {
                a -= b;
            }else {
                b -= a;
            }
        }

        System.out.println(a);
    }
}
