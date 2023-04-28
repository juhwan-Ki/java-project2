package com.example.javaproject.baekjoon;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 자바 11에서 부터 repeat() 함수를 통해 문자열을 반복 할 수 있다.
        String str = "*";
        for(int k = 0; k < b; k++){
            System.out.println(str.repeat(a));
        }

    }
}
