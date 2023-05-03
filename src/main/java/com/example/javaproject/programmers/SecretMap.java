package com.example.javaproject.programmers;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        int n = 6; // 배열의 갯수를 받는 변수
        int[] arr1 = {46, 33, 33 ,22, 31, 50}; // 1번 지도
        int[] arr2 = {27 ,56, 19, 14, 14, 10}; // 2번 지도
        String[] result = new String[n];  // 풀이한 지도
        // 반복을 통해 지도를 변환한다.
        for(int i = 0; i < n; i++){
            result[i] = String.format("%" + n + "s",
                    Integer.toBinaryString(arr1[i] | arr2[i])
                            .replace("1", "#")
                            .replace("0", " "));
        }
        System.out.println(Arrays.toString(result));
    }

    /* 비밀지도 문제 OR(|)를 사용하여 1이면 # 0 이면 공백으로 표시
    * 풀이 : 먼저 입력 받은 2개의 지도를 OR 연산으로 바이너리로 변환
    * 이 때 int를 String으로 변환할 때 자리수 변환이 필요함(int는 00110 -> 110 이렇게 표시하기 때문에 앞에 0이 들어가면 0이 표시가 안됨)
    * 변환 후 .replace()를 통해 1은 #으로 0은 공백으로 변환한다.
    * */
}
