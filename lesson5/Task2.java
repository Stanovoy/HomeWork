package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите число в римском формате:");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] validation = {"MMMM", "DD", "DM", "DCM", "DCD", "CCCC", "CMM", "CCM", "CCD",
            "CMC", "CMD", "LL", "LD", "LM", "LC", "XXXX","XCC", "XCD", "XCM", "XXC", "XXD",
            "XXM", "XXL", "XLX",  "VV",  "VX", "VL", "VC", "VD", "VM", "VIV", "IM", "ID",  "IC",
            "IIX", "IL", "IXC", "IIV", "IIII"};
        int resultBoolean = 0;

        for (int j = 0; j < validation.length; j++) {
           boolean resultBooleanTemp = value.contains(validation[j]);
                if (resultBooleanTemp == true) {
                resultBoolean = 1;
                break;
                }
        }
        if (resultBoolean == 1){
            System.out.println("Введенная последовательность символов  не является римским числом");
        }
        else {
            String[] rom = {"MMM", "MM", "MCM", "M", "CM", "DCCC", "DCC", "DC", "D", "CD", "CCC",
                "CC", "C", "XC", "LXXX", "LXX", "LX", "L", "XL", "XXX", "XX", "XIX", "XVIII",
                "XVII", "XVI", "XV", "XIV", "XIII", "XII", "XI", "X", "IX", "VIII", "VII", "VI",
                "V", "IV", "III", "II", "I"};
            int[] arab = {3000, 2000, 1900, 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100,
                90, 80, 70, 60, 50, 40, 30, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7,
                6, 5, 4, 3, 2, 1};
            int resultRomenToAraben = 0;

            for (int i = 0; i < rom.length && value.length() > 0; i++) {
                boolean start = value.startsWith(rom[i]);
                if (start == true) {
                    value = value.replace(rom[i], "");
                    resultRomenToAraben += arab[i];
                }
            }
            if ((resultRomenToAraben == 0) || (resultRomenToAraben > 3999) || (value.length() != 0)) {
                System.out.println("Введенная последовательность символов  не является римским числом");
            }
               else{
                   System.out.println(resultRomenToAraben);
               }
        }
    }
}








