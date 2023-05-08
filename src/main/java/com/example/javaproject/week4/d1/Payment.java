package com.example.javaproject.week4.d1;

public class Payment {
    public static void main(String[] args) {
        Account ac = new Account();
        boolean isSufficient = ac.isSufficient();
        if (isSufficient){
            System.out.println("결제 처리 합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}
