package lesson10.task1;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        String text = "I didn't know what a trapshoot was, but the words live birds" +
                " interested me very much, and I went to the club the next Saturday" +
                " afternoon. I found a small crowd of men there, each with a shot-gun." +
                " A wagon stood near, and in it there were a lot of cages containing small" +
                " birds. Each cage had a door which opened out flat when the man, the" +
                " bird-catcher who owned the birds, pulled the string attached to each door";

        System.out.println(replacement(text));
    }

    public static Map replacement(String text) {
        String[] word = text.split("[ ,.]+");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String key : word) {
            if (map.containsKey(key)) {
                Integer number = map.get(key);
                number = number + 1;
                map.put(key, number);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}
