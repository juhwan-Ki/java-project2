package com.example.javaproject.week4.d2;

public class Parallelogram {
    private String spaceChar = "0";

    public Parallelogram(String spaceChar){
        this.spaceChar = spaceChar;
    }

    public String makeALine(int h, int i){
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h));
    }

    public static void main(String[] args) {
        Parallelogram rp = new Parallelogram(" ");
        int h = 5;
        for (int i = 0; i < h; i++) {
            System.out.printf(rp.makeALine(h,i));
        }
    }
}
