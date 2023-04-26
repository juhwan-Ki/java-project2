package com.example.javaproject.week2.d3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "이다엘";
        students[0].age = 22;
        students[0].phoneNumber = "010-1234-5678";

        students[1] = new Student();
        students[1].name = "김주환";
        students[1].age = 25;
        students[1].phoneNumber = "010-4321-5678";
    }
}
