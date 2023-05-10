package com.example.javaproject.week4.d3;

import java.io.IOException;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String[] lines) throws IOException {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }
}
