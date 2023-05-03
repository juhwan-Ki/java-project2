package com.example.javaproject.week3.d2;

public class Digits {
    public static void main(String[] args) {
        int num = 123456;
        int digits = 0;

        while(num > 0){
            num += num %10;
            num /= 10;
            digits++;
        }

        System.out.println(digits);
    }
}
