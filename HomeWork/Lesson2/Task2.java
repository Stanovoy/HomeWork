package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Для размещения объектов на плане вам необходимо ввести геометрические \nпараметры в метрах земельного участка и построек!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину первого строения: ");
        int a = scanner.nextInt();
        System.out.println("Введите длинну первого строения: ");
        int b = scanner.nextInt();
        System.out.println("Введите ширину второго строения: ");
        int c = scanner.nextInt();
        System.out.println("Введите длинну второго строения: ");
        int d = scanner.nextInt();
        System.out.println("Введите ширину участка: ");
        int e = scanner.nextInt();
        System.out.println("Введите длинну участка: ");
        int f = scanner.nextInt();

        if ( (a + c < e) & (a + d < e) & (a + c < f) & (a + d < f) & (b + c < e) & (b + d < e) & (b + c < f) & (b + d < f) ) {
            System.out.println("Постройки с указанными геометрическими параметрами можно разместить на данном участке.");
        }else{
            System.out.println("Постройки с указанными геометрическими параметрами невозможно разместить на данном участке!!!");
    }
    }
}
