package lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Введи количество дней: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summa = 0;
        int max = 0;
        double midl = 0;
        int c=1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введи количество осадков.\nДень:" + c++);
            scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            summa += a;

            if (a > max){
                max = a;
            }
            midl=summa/n;
        }
        System.out.println("Данные по осадкам за указанный период:");
        System.out.println("Количество дней:" + n);
        System.out.println("Суммарное значение осадков за указанный период:" + summa + " (мм)");
        System.out.println("Среднее количество осадков за указанный период:" + midl + " (мм)");
        System.out.println("Максимальное количество дневных осадков за этот период:" + max + " (мм)");
    }

}