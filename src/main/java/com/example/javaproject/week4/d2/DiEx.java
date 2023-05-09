package com.example.javaproject.week4.d2;

public class DiEx {
    private ShapeDrawer shapeDrawer;

    public DiEx(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void doSth(){
        shapeDrawer.printShape(5);
    }
}
