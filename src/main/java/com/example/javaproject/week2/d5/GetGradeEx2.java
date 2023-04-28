package com.example.javaproject.week2.d5;

public class GetGradeEx2 {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 90) { // false
            System.out.println("A");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 70) { // true
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
