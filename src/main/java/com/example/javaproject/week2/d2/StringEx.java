package com.example.javaproject.week2.d2;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("str1 = " + str1.substring(0,1).hashCode());
        System.out.println("str2 = " + str2.hashCode());

    }
}
