package com.itacademy.stanovoy.lesson17;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class MyFileReader {

    public StringBuffer stringBuffer = new StringBuffer();

    File file = Paths.get("resources", "regex").toFile();

    public MyFileReader() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNext()) {
                stringBuffer.append(scanner.nextLine());
            }
        }
    }
}