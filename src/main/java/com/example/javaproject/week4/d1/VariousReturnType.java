package com.example.javaproject.week4.d1;

public class VariousReturnType {
    public boolean isAdult(){
        return true;
    }
    public int plus(){
        return 1 + 1;
    }
    public User getUser(){
        return new User();
    }
    public void printHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        VariousReturnType vr = new VariousReturnType();
        boolean isAdult = vr.isAdult();
        int num = vr.plus();
        User user = vr.getUser();
        vr.printHello();
    }
}
