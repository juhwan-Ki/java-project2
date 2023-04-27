package com.example.javaproject.week2.d4;

public class Accumulate687While {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        while (num > 0){
            answer = answer + (num % 10);
            num = num / 10;
        }
        System.out.println(answer);
    }
}
