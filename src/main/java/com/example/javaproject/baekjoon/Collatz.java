package com.example.javaproject.baekjoon;

public class Collatz {
    public static void main(String[] args) {
        int answer = 0;
        long num = 626331;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
            System.out.println(answer + " " + num);

            if (answer >= 500) {
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
    }
}
