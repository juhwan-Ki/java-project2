package com.example.javaproject.week3.d3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0;
        // 2부터 시작한 이유는 1은 모든 수의 약수이기 때문에 2부터 시작한다
        for(int i = 2; i < num; i++){
            if(num % i == 0) factors++; // 나누어 떨어지면 ++
        }
        System.out.println("factors : " + factors);
        System.out.println(factors == 0? num + "은 소수입니다.": num + "은 소수가아닙니다.");
    }
}
