package com.example.javaproject.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] coins = {500, 100, 50, 10, 5, 1};

        for(int i = 0; i < coins.length; i++) {
            if (money / coins[i] > 0) {
                cnt += money / coins[i];
                money %= coins[i];
            }
        }
        System.out.println(cnt);
    }
}
