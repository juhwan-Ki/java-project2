package com.example.javaproject.programmers;

import java.util.Arrays;

public class ArrayAndQuery3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] arr2 = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        solution(arr, arr2);
    }

     public static int[] solution(int[] arr, int[][] queries) {
         int[] answer = new int[arr.length];

         for(int i = 0; i < queries.length; i++){
             for(int j = queries[i][0]; j <= queries[i][1]; j++){
                 if(j % queries[i][2] == 0){
                     arr[j]++;
                 }
             }
         }
         answer = arr;
         System.out.println(Arrays.toString(answer));
         return answer;
     }
}
