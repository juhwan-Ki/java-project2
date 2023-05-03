package com.example.javaproject.programmers;

import java.util.Arrays;

public class ArrayAndQuery2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] arr2 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        solution(arr, arr2);
    }

     public static int[] solution(int[] arr, int[][] queries) {
         int[] answer = new int[queries.length];

         for(int i = 0; i < queries.length; i++){
             int min = Integer.MAX_VALUE;
             for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                 if(arr[j] > queries[i][2]){
                     min = Math.min(min, arr[j]);
                 }
             }

             if(min != Integer.MAX_VALUE){
                 answer[i] = min;
             } else {
                 answer[i] = -1;
             }
         }
         System.out.println(Arrays.toString(answer));
         return answer;
     }
}
