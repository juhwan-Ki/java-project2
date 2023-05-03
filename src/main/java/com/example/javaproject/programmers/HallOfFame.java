package com.example.javaproject.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFame {
    public static void main(String[] args) {
        int[] arr ={10, 100, 20, 150, 1, 100, 200};
        solution(3, arr);

    }
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] scores = new int[k]; // 명예의 전당

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                // 현재 확인하려는 i가 명예의 전당의 j번째 보다 크다면
                if (scores[j] < score[i]) {
                    // 뒤로 전부 한칸씩 밀기
                    for (int l = scores.length - 1; l > j; l--) {
                        scores[l] = scores[l - 1];
                    }
                    // 빈 자리에 현재 i 넣기
                    scores[j] = score[i];
                    break;
                }
            }
            // 현재 명예의 전당에 등록된 수에 따라 answer에 삽입
            if (i < k - 1)
                answer[i] = scores[i];
            else {
                answer[i] = scores[k - 1];
            }
        }
        // 출력
        return answer;
    }
}
