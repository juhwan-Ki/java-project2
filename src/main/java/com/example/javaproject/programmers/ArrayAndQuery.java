package com.example.javaproject.programmers;

import java.util.Arrays;

public class ArrayAndQuery {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2 = {{0, 3},{1, 2},{1, 4}};
        solution(arr, arr2);
    }

     public static int[] solution(int[] arr, int[][] queries) {
         int[] answer = arr;

         for(int i = 0; i < queries.length; i++){
             int num1 = queries[i][0];
             int num2 = queries[i][1];
             int temp = answer[num1];

             answer[num1] = answer[num2];
             answer[num2] = temp;
         }
         System.out.println(Arrays.toString(answer));
         return answer;
     }
}
