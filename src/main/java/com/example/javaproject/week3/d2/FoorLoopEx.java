package com.example.javaproject.week3.d2;

public class FoorLoopEx {
    public static void main(String[] args) {
        // 무한 for문
//        for (int i = 0; true; i++) {
//            System.out.println(i);
//        }

        // 루트를 이용한 for 문
        for(int i = 0; i * i < 50; i++){
            System.out.println(i);
        }
    }

}
