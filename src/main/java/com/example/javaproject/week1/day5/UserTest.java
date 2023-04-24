package com.example.javaproject.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User kevin = new User();
        kevin.name = "케빈";
        kevin.phone = "010-1234-5678";
        kevin.age = 11;

        User dael = new User();
        dael.name = "다엘";
        dael.phone = "010-4321-8765";
        dael.age = 22;

        System.out.printf("%s님은 성인입니까? %s\n", kevin.name, kevin.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", dael.name, dael.isAdult());
    }
}
