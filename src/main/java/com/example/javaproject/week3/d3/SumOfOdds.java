package com.example.javaproject.week3.d3;

import java.util.Scanner;

public class SumOfOdds {
    public static void main(String[] args) {
        int num = 10;
        int answer = 0;
        for (int i = 0; i <= num; i++) {
            if(i % 2 == 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
