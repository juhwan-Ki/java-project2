package com.example.javaproject.week4.d2;

public class Pyramid {
    private String spaceChar = "0";
    private String shape = "*";

    public Pyramid(String spaceChar, String shape) {
        this.spaceChar = spaceChar;
        this.shape = shape;
    }

    public String makeALine(int height, int i ){
        return String.format("%s%s\n",spaceChar.repeat(height - i - 1), shape.repeat(2 * i + 1));
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public static void main(String[] args) {
        Pyramid pyramid2 = new Pyramid(" ", "#");
        Pyramid pyramidSpaceZero = new Pyramid("0", "*");
        pyramid2.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }

}
