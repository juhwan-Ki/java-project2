package com.example.javaproject.week4.d2;

import java.util.Arrays;

public class SeparateInToStaticMethod {
    public static void printArr(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("============");
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20 ,30},
                {40, 50 ,60},
                {70, 80, 90}
        };
        printArr(arr);

        arr[0][0] = 0;
        arr[1][0] = 0;
        arr[2][0] = 0;

        printArr(arr);
    }
}
