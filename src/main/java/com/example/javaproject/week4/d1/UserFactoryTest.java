package com.example.javaproject.week4.d1;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory us = new UserFactory();
        User user1 = us.getAdultUser();
        System.out.println(user1.isAdult());
    }
}
