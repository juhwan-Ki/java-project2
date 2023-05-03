package com.example.javaproject.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        // 소인수분해를 하려면 어떻게 해야할까?
        // 먼저 소인수분해의 뜻을 알아보자
        // 소인수분해는 어떠한 수를 소수인 인수로 나누는 것을 말한다.
        // 소인수분해를 하려면 입력받는 수를 소수로 만들어야 한다.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] answer;
        int[] tempArr = new int[(int)Math.sqrt(num)];
        int idx = 0;
        int temp = 0;

        for(int i = 2; i <= num; i++){
            while (num % i == 0){
                if(temp != i){
                    temp = i;
                    tempArr[idx] = temp;
                    idx++;
                }
                num /= i;
            }
        }

        if(idx == 0){
            answer = new int[1];
            answer[idx] = num;
        } else {
            answer = new int[idx];
            for (int i = 0; i <answer.length ; i++) {
                answer[i] = tempArr[i];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
