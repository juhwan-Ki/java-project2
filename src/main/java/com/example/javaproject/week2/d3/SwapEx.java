package com.example.javaproject.week2.d3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        // 오름차순으로 정렬하는 알고리즘을 만들어 보세요
        int[] arr = {2, 1, 4, 8, 7, 6};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp2;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
