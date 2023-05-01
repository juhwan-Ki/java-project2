package com.example.javaproject.week3.d1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) throws IllegalAccessException {
        String day = "월";
        String time = switch (day){
            case "월", "화", "목", "금" -> "09:30-18:30";
            case "토" -> "09:30-13:00";
            case "수", "일" -> "휴진";
            default -> throw new IllegalAccessException("입력받은 요일은 존재하지 않습니다. 입력요일 : " + day);
        };
        System.out.printf("%s요일 진료시간은 %s 입니다.",day, time);
    }
}
