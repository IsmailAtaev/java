package com.task.io;

public interface IData extends IPrinter, IReader {
    default double input(String text) {
        print(text);
        return read();
    }
}
