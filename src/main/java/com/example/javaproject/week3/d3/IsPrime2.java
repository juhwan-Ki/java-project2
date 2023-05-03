package com.example.javaproject.week3.d3;

import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        // num/2까지 확인하는 방법
        for (int i = 2; i <= num / 2; i++) {
            if(num % 2 == 0){
                cnt++;
            }
        }
        System.out.println(cnt > 0 ? "not prime": "prime");
    }
}
