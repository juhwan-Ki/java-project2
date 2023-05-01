package com.example.javaproject.week3.d1;

public class MultiplicationTable {

    public static void printDan(int dan){
        for(int j = 1; j <= 9; j++){
            System.out.printf("%d * %d = %d\n", dan, j, j * dan);
        }
        System.out.println("=============");
    }

    public static void main(String[] args) {
//        for(int i = 2; i <= 4; i++){
//            for(int j = 1; j <= 9; j++){
//                System.out.printf("%d * %d = %d\n", i, j, j * i);
//            }
//            System.out.println("=============");
//        }
        printDan(2);
        printDan(4);
        printDan(5);
        printDan(8);
    }
}
