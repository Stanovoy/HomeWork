package lesson3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){
        System.out.println("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a=0;
        int b=0;
        int c=1;

        for(int i=0; ; i++){

            a=b;
            b=c;
            c=a+b;

            if (a>=n)
                break;
            System.out.print(a + "; ");
        }
        }
    }

