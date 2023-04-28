package com.example.javaproject.week2.d5;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        int arr[] = {2, 1, 7, 9};
        boolean check = arr[0] > arr[1];
        if(check){
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {2, 8, 1, 5, 3, 10};
        int temp2 = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = i + 1; j < arr2.length; j++){
                if(arr2[i] > arr2[j]){
                    temp2 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp2;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
