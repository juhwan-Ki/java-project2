package com.example.javaproject.programmers;

public class DiceGame {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        int answer = 0;

        if(a == b && a == c && b == c){
            answer = (int) ((a + b + c)
                    * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))
                    * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)));
        } else if(a == b ||b == c || a == c){
            answer = (int) ((a + b + c)
                    * (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2)));
        } else {
            answer = (int) (a + b + c);
        }
        System.out.println(answer);
    }
}
