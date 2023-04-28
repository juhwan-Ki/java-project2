package com.example.javaproject.week2.d5;

public class SwitchCaseDayOfWeek2 {
    public static void main(String[] args) {
        int dayOfWeek = 4; // 1: 월요일, 2: 화요일, ... , 7: 일요일
        switch (dayOfWeek)
        {
            case 1:
                System.out.println("월요일");
            case 2:
                System.out.println("화요일");
            case 3:
                System.out.println("수요일");
            case 4:
                System.out.println("목요일");
        }
    }

}
