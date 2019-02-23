package lesson12;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        File file = Paths.get("resources", "number.txt").toFile();

        try (PrintWriter pw = new PrintWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                pw.println(random.nextInt(100));
            }
        }
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNext()) {
                Integer number = Integer.valueOf(scanner.next());
                list.add(number);
                Collections.sort(list);
                try (PrintWriter pw = new PrintWriter(file)) {
                    for (int i = 0; i < list.size(); i++) {
                        pw.println(list.get(i));
                    }
                }
            }
        }
    }
}









