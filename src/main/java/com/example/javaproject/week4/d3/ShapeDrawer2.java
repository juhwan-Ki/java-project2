package com.example.javaproject.week4.d3;

public abstract class ShapeDrawer2 {

    public abstract String makeALine(int h, int i);


    public void printShape(int h){
        for (int i = 0; i < h; i++) {
            System.out.printf("%s", makeALine(h,i));
        }
    }

}
