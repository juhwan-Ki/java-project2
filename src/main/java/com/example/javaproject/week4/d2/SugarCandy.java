package com.example.javaproject.week4.d2;

import java.util.Arrays;
import java.util.Scanner;

public class SugarCandy {
    private int[][] arr;

    public SugarCandy(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }
    public void setBeam(int l, int d, int x, int y){
        for (int i = 0; i < l; i++) {
            if(d == 0){ // 가로
                arr[x- 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("==============");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        SugarCandy sc = new SugarCandy(rowCnt,colCnt);
        sc.printArr();
        sc.setBeam(2,0,1,1);
        sc.printArr();
        sc.setBeam(3,1,2,3);
        sc.printArr();
        sc.setBeam(4,1,2,5);
        sc.printArr();
    }
}
