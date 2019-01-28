package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){

        System.out.println("Эта программа предназначена для решения квадратного уравнения вида\nax^2+bx+c=0.\nСейчас вам бедет предложено ввести исходные данные...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();
        System.out.println("Введите c:");
        double c = scanner.nextDouble();
        double x1=0;
        double x2=0;
        double x3=0;

            if (isPozitive(isDiscriminant(a,b,c))){
                x1=(-b+Math.sqrt(isDiscriminant(a,b,c)))/(2*a);
                x2=(-b-Math.sqrt(isDiscriminant(a,b,c)))/(2*a);
                System.out.println("Решение уравнения имеет два корня:");
                System.out.println("X1=" + x1 + ";");
                System.out.println("X2=" + x2 + ";");
            } else if(isZero(isDiscriminant(a,b,c))){
                x3=-b/2*a;
                System.out.println("Решение уравнения имеет один корень:");
                System.out.println("X=" + x3 + ";");
            } else {System.out.println("Корней на множестве действительных чисел нет.");
            }
        System.out.println("Значение дискриминанта равно D=" + isDiscriminant(a,b,c) + ";");
        System.out.println("Введенные вами значения:" + "a=" + a + "; " + "b=" + b + "; " + "c=" + c + ". ");
    }


    public static double isDiscriminant(double a, double b, double c){
        double d=b*b-4*a*c;
        return d;
    }

    public static boolean isZero(double isDiscriminant){
        return (isDiscriminant==0);
    }

    public static boolean isPozitive(double isDiscriminant){
        return (isDiscriminant>0);
    }
}

