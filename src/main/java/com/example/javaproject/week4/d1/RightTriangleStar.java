package com.example.javaproject.week4.d1;

public class RightTriangleStar {
    public static void main(String[] args) {
        int height = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
