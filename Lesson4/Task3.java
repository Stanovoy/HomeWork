package Lesson4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numA = new int[]{0, 1, 2,};
        int[] numB = new int[]{3, 4, 5, 6, 7};
        int[] numSum = new int[numA.length + numB.length];


        for (int i = 0; i < numA.length; i++) {
            numSum[i] = numA[i];
        }
        for (int j = 0; j < numB.length; j++) {
            numSum[numA.length + j] = numB[j];
        }
        System.out.println(Arrays.toString(numA) + Arrays.toString(numB));
        System.out.println(Arrays.toString(numSum));
    }
}