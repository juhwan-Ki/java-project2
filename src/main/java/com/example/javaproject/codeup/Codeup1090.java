package com.example.javaproject.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        long sum = num1;

        for(int i = 1; i < num3; i++){
            sum *= num2;
        }
        System.out.println(sum);
    }
}