package com.example.javaproject.week1.day5;

public class User {
    // 이름. 나이, 전화번호
    String name;
    int age;
    String phone;

    boolean isAdult() {
        return age >= 18;
    }

}
