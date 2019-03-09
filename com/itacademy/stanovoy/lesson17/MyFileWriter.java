package com.itacademy.stanovoy.lesson17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyFileWriter {

    public MyFormat myFormat = new MyFormat();

    public MyFileWriter() throws IOException {
        fileWriter(myFormat.schedule, "resources", "regex1.txt");
        fileWriter(myFormat.timeActivity, "resources", "regex2.txt");
    }

    private static void fileWriter(String[] strWriter, String paths, String fileName) throws IOException {
        Path writePath1 = Paths.get(paths, fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath1.toFile()))) {
            for (String e : strWriter) {
                bufferedWriter.write(e);
                bufferedWriter.newLine();
            }
        }
    }
}