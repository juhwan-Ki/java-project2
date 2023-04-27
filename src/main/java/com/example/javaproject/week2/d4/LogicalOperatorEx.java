package com.example.javaproject.week2.d4;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;

        if(age >= 18 && !isStudent){
            System.out.println("성인이면서 학생이 아닙니다.");
        }
    }
}
