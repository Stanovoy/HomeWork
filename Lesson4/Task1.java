package Lesson4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7};
        int cycle = 1; //Изменяя переменную, можно просмотреть несколько циклов.

        for (int z = 1; z <= cycle; z++){
            int temp = num[num.length - 1];
            for (int i = 1; i < num.length; i++){
                num[num.length - i] = num[num.length - (i + 1)];
            }
            num[0] = temp;
            System.out.println(Arrays.toString(num));

        }
    }
}



