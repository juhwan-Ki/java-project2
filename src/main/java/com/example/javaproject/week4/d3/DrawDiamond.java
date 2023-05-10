package com.example.javaproject.week4.d3;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n){
        String returnVal = "";
        for (int i = 0; i < n; i++){
            returnVal += symbol;
        }
        return returnVal;
    }

    public static void main(String[] args) {
        int h = 5;
        int pivot = h / 2;

        for (int i = 0; i < h; i++) {
            if(i <= pivot){
               // 피라미드 로직
                System.out.printf("%s%s\n", getRepeatedSymbol("0", pivot -i), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                // 역 피라미드 로직
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
            }

        }
    }
}
