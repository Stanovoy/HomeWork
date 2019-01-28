package lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int result= 0;

        while ((value / 10 != 0) || (value % 10 != 0)){

            result += value % 10;
            value /= 10;
        }
        System.out.println(result);
    }
}
