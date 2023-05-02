package com.example.javaproject.programmers;

import java.util.Arrays;

public class MultipleArray1 {
    public static void main(String[] args) {
        int[][] answer = new int[3][3];

        for(int i = 0; i < answer.length; i++){
                answer[i][i] = 1;
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}

