package com.example.javaproject.week2.d3;

import java.util.Arrays;

public class TwoDimArrEx {
    // 메소드(method, function, 함수)로 Refactoring(기능을 바꾸지 않고?)
    // parameter
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        printArray(arr);

        arr[0][0] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        printArray(arr);

        arr[1][1] = 5;
        printArray(arr);
    }
}
