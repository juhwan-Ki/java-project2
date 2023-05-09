package com.example.javaproject.week4.d2;

public class MultiplicationTable {
    private String multipleSymbol;
    // 반복되는 부분을 스태틱 메소드로 변경

    public MultiplicationTable(String multipleSymbol){
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int num) {
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%d %s %d = %d\n", num, multipleSymbol, j, num * j);
        }
        System.out.println("===============");
    }

    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable("x");
        mt.printDan(2);
        mt.printDan(3);
        mt.printDan(4);

        MultiplicationTable mt2 = new MultiplicationTable("*");
        mt2.printDan(2);
        mt2.printDan(3);
        mt2.printDan(4);
    }
}
