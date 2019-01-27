package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int nextYear=0;
        int nextMonth=0;
        int nextNumber=0;
        System.out.println("Хочешь узнать, что ждет тебя завтра? Тогда вперед: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интересующий вас год: ");
        int year = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        while (month > 12 || month < 0) {
            System.out.println("В году не может быть больще 12 месяцев, введите заново: ");
            scanner = new Scanner(System.in);
            System.out.println("Введите месяц: ");
            month = scanner.nextInt();
        }
        scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        while (number > 31 & (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("В выбранном вами месяце не может быть больще 31 дня, уточните: ");
            scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        }
        while (number > 30 & (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("В выбранном вами месяце не может быть больще 30 дня, уточните: ");
            scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        }
        while (number > 29 & month == 2 & (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            System.out.println("В феврале високосного года не больще 29 дней, уточните: ");
            scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        }
        while (month == 2 & number > 28 & !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            System.out.println("В феврале не больще 28 дней,если это не високосный год, конечно.\nУказанный вами год не является таковым. Будьте внимательны: ");
            scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        }


        nextMonth = month;
        nextNumber = number+1;

        if (nextNumber > 31 & (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            nextNumber = 1;
            nextMonth = month+1;
        }


        if (nextNumber > 30 & (month == 4 || month == 6 || month == 9 || month == 11)){
            nextNumber = 1;
            nextMonth = month+1;
        }

        if (nextNumber > 29 & month == 2 & (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            nextNumber = 1;
            nextMonth = month+1;
        }

        if (nextNumber > 28 & month == 2){
            nextNumber = 1;
            nextMonth = month+1;
        }

        if (nextMonth > 12){
            nextYear = year+1;
            nextMonth = 1;
        }
        else {
            nextYear = year;
        }
        System.out.println(year + ": " + month + ": " + number + " - Это дата, которую ввел ты");
        System.out.println(nextYear + ": " + nextMonth + ": " + nextNumber + " - А это дата будущего дня :) ");
        System.out.println("Условием задачи была добавить один день к введенной пользователем дате!\nЭтот код - мрак, но я стану лучше, если не застрелят раньше!!!");
}
}