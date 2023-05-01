package com.example.javaproject.week3.d1;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) throws IllegalAccessException {
        int month = 13;
        int laseDate = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalAccessException("해당월은 없습니다. 입력월 : " + month);
        };
        System.out.printf("%d월은 %d일까지 있습니다.",month, laseDate);
    }
}
