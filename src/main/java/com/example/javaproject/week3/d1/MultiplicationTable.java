package com.example.javaproject.week3.d1;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }

        for(int i = 2; i <= 4; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d * %d = %d\n", i, j, j * i);
            }
            System.out.println("=============");
        }
    }
}
