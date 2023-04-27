package com.example.javaproject.week2.d4;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.println("미성년자 입니까? " + !isAdult);
    }
}
