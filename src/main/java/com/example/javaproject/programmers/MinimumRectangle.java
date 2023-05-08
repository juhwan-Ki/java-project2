package com.example.javaproject.programmers;

public class MinimumRectangle {
    public static void main(String[] args) {
        int answer = 0;
        int[][] arr = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 1}};
        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
                if(max == 0){
                    max = Math.max(arr[i][0],arr[i][1]);
                    min = Math.min(arr[i][0],arr[i][1]);
                } else {
                    max = Math.max(max, Math.max(arr[i][0], arr[i][1]));
                    min = Math.max(min, Math.min(arr[i][0], arr[i][1]));
            }
        }
        answer = max * min;
        System.out.println(answer);
    }
}
