package com.example.javaproject.week4.d3;

import com.example.javaproject.week4.d2.ShapeDrawer;

public class DrawDiamond extends ShapeDrawer {
    public static String getRepeatedSymbol(String symbol, int n){
        String returnVal = "";
        for (int i = 0; i < n; i++){
            returnVal += symbol;
        }
        return returnVal;
    }
    public String makeALine(int h, int i){
        int pivot = h / 2;
        if(i <= pivot){
            // 피라미드 로직
            return String.format("%s%s\n", getRepeatedSymbol("0", pivot -i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            // 역 피라미드 로직
            return String.format("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer sh = new DrawDiamond();
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.print(sh.makeALine(h, i));
        }
    }
}
