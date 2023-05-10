package com.example.javaproject.week4.d3;

public class RightTriangleShapeDrawer extends ShapeDrawer2{

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i + 1));
    }

    public static void main(String[] args) {
        ShapeDrawer2 right = new RightTriangleShapeDrawer();
        right.printShape(5);
    }
}
