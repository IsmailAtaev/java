package com.task.io;

import org.jetbrains.annotations.NotNull;

import javax.security.sasl.SaslClient;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReaderConsole implements IReader {
    private Scanner scanner;

    public ReaderConsole(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public double read() {
        return scanner.nextDouble();
    }
}
