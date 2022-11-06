package com.task.io;

public class Data implements IData {
    private IReader reader;
    private IPrinter printer;

    public Data(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(double num) {
        printer.print(num);
    }

    @Override
    public double read() {
        return reader.read();
    }
}
