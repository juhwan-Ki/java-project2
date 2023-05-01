package com.example.javaproject.programmers;

public class ConcatNumber {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 2, 1};
        String oddNumber = "";
        String evenNumber = "";
        int answer = 0;

        for (int i = 0; i < numList.length; i++) {
            if(numList[i] % 2 == 0){
                evenNumber += numList[i] + "";
            } else {
                oddNumber += numList[i] + "";
            }
        }
        answer = Integer.parseInt(oddNumber) + Integer.parseInt(evenNumber);
        System.out.println(answer);
    }
}
