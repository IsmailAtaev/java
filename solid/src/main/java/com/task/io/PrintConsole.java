package com.task.io;

public class PrintConsole implements  IPrinter {

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(double num) {
        System.out.print(" " + num + " ");
    }
}
