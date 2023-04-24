package com.example.javaproject.week2;

public class NumberFormatException1 {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";

        int result = Integer.parseInt(val1) + Integer.parseInt(val2);
        System.out.println("result = " + result);
    }
}
