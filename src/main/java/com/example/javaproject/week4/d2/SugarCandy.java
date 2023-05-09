package com.example.javaproject.week4.d2;

import java.util.Arrays;
import java.util.Scanner;

public class SugarCandy {
    private int[][] arr;
    boolean printSeparator;

    // 메소드 오버로딩
    public SugarCandy(int rowCnt, int colCnt) {
        this.arr = new int[rowCnt][colCnt];
    }

    public SugarCandy() {
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public SugarCandy(boolean printSeparator) {
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }

    public SugarCandy(int colCnt) {
        this.arr = new int[5][colCnt];
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
        if(this.printSeparator) System.out.println("==============");
    }

    public static void main(String[] args) {
        int rowCnt = 5;
        int colCnt = 5;
        //SugarCandy sc = new SugarCandy(rowCnt,colCnt);
        //SugarCandy sc = new SugarCandy();
        SugarCandy sc = new SugarCandy(colCnt);
        sc.printArr();
        sc.setBeam(2,0,1,1);
        sc.printArr();
        sc.setBeam(3,1,2,3);
        sc.printArr();
        sc.setBeam(4,1,2,5);
        sc.printArr();
    }
}
