package lesson12;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {

    public static void main(String[] args) throws IOException {
        File file = Paths.get("resources", "text").toFile();

        try (FileReader reader = new FileReader(file)) {
            int symbol;
            TreeMap<Character, Integer> map = new TreeMap<>();
            while ((symbol = reader.read()) != -1) {
                if (Character.isLetter(symbol)) {
                    symbol = Character.toLowerCase(symbol);
                    map.merge((char) symbol, 1, (oldVal, newVal) -> oldVal + newVal);
                }
            }
            File file1 = Paths.get("resources", "text1.txt").toFile();

            try (PrintWriter pw = new PrintWriter(file1)) {
                if (!map.isEmpty()) {
                    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                        pw.println(entry.getKey() + " - " + entry.getValue());
                    }
                }
            }
        }
    }
}




