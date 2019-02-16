package lesson9.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("this");
        list.add("qwerty");
        list.add("is");
        list.add("lots");
        list.add("off");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        markLength4(list);
        System.out.println(list);
    }

    public static void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i + 1, "****");
                i += 1;
            }
        }
    }
}
