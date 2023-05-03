package com.example.javaproject.programmers;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int n = 15;
        int k = 5;
        int idx = 0;
        int[] answer = new int[n / k];

        for(int i = 1; i <= n; i++){
            if(i % k == 0){
            answer[idx] = i;
            idx++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
