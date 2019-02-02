package Lesson4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] num = new int[]{0, 5, 2, 3, 3, 2, 5, 7, 6, 7, 0, 3, 4, 5, 4, 1, 5};
        System.out.println(Arrays.toString(num));

        for (int j = 0; j < num.length; j++) {
            while ((num[j] == 0) & (j < num.length-1)) {
                j = j + 1;
            }
            for (int i = 1; ((j + i) < num.length) && (i <= num.length); i++) {
                if (num[j] == num[j + i]) {
                    num[j + i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Это круто!!!");
    }
}







