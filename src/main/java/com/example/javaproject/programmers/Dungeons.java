package com.example.javaproject.programmers;

public class Dungeons {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,30},{50,40},{30,10}};
        int answer = 0;
        // 해당 문제를 풀기 위한 설계
        // 1. 현재 피로도가 던전에서 요구하는 피로도 보다 큰지
        // 2. 피로도가 소모가 제일 작은거 부터 처리하는게 좋을 듯
        // 결론 현재 피로도보다 던전에서 요구하는 피로도가 높고 피로도 소모가 제일 적은 것 부터 처리한다.

        for (int i = 0; i < dungeons.length; i++) {
            for (int j = 0; j < dungeons[i].length; j++) {
                if(k > dungeons[i][0]){

                }
            }

        }
    }
}
