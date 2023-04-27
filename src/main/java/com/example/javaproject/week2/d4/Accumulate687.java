package com.example.javaproject.week2.d4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        // 나머지를 먼저 구하고
        answer = answer + num % 10;
        System.out.println("answer = " + answer);
        // 그 뒤에 몫을 구해야 한다
        num = num / 10;
        answer = answer + num % 10;
        System.out.println("answer = " + answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.println("answer = " + answer);
    }
}
