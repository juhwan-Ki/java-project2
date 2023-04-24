package com.example.javaproject.week1.day5;

import com.example.javaproject.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 1;
    public static final int MIN_LEVEL = 1;
    public static void main(String[] args) {
        final int iVal; // 지역변수여서 상수명명법을 사용하지 않음
        iVal = 1;

        // 객체에 DI를 받을 때 사용?
        final PrintHello printHello = new PrintHello();
    }
}
