package com.example.javaproject.week4.d1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김미미";
        user1.age = 33;

        User user2 = new User();
        user2.name = "김나나";
        user2.age = 30;

        System.out.printf("%s는 성인입니까? %b\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %b\n", user2.name, user2.isAdult());
    }
}
