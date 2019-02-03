package lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        if (isEquals(value) == true) {
            System.out.println("Введенная строка является полиндромом");
        } else {
            System.out.println("Введенная строка не является полиндромом");
        }
    }

    public static boolean isEquals(String value) {
        value = value.replace(" ", "");
        StringBuffer stringTemp = new StringBuffer(value);
        stringTemp.reverse();
        String stringEquals = stringTemp.toString();

        boolean resalt = true;
        if (!value.equalsIgnoreCase(stringEquals)) {
            resalt = false;
        }
        return resalt;
    }
}

