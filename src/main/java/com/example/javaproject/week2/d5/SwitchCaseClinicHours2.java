package com.example.javaproject.week2.d5;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "월";
        String time = "09:00-19:00";
        switch (day){
            case "월", "화", "수", "목", "금" : break;
            case "토" : time = "09:00-16:00"; break;
            case "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s 입니다.\n", day,time);
    }
}
