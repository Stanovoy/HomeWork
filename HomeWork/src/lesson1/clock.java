package lesson1;

import java.util.Scanner;

public class clock {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд: ");
        int value = scanner.nextInt();
        int sec = value % 60;
        int m = (value - sec) / 60;
        int min = (m % 60);
        int h = (m - min) / 60;
        System.out.println (h +  "часов" + min + "минут" + sec + "секунд");
    }
}
