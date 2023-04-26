package com.example.javaproject.week2.d3;

public class LikeAccumulator {
    public static void main(String[] args) {
        int likeCnt = 0;
        likeCnt = likeCnt + 1;
        System.out.println(likeCnt);

        likeCnt = likeCnt + 1;
        System.out.println(likeCnt);

        likeCnt = likeCnt - 1;
        System.out.println(likeCnt);

        int bankAccount = 1000000;
        bankAccount = bankAccount- 500000;
        System.out.println(bankAccount);

        bankAccount = bankAccount + 4000000;
        System.out.println(bankAccount);

    }
}
