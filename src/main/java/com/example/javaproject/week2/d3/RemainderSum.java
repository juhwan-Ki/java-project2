package com.example.javaproject.week2.d3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10;
        num = num / 10;
        int secondRemainder = num % 10;
        num = num / 10;
        int thirdRemainder = num % 10;
        System.out.println("loop이용X : " + (firstRemainder + secondRemainder + thirdRemainder));

        // loop를 이용
        int num2 = 687;
        int result = 0;
        for(int i = 0; i < 3; i++){
             result += (num2 % 10);
             num2 = num2 / 10;
        }
        System.out.println("loop이용 : " + result);

    }
}
