package Lesson4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numA = new int[]{1, 2,};
        int[] numB = new int[]{3, 4, 5, 6, 7};

        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(numSum(numA, numB)[i]));
        }
    }

    public static int[][] numSum(int[] array, int[] array1) {
        int[][] numSum = new int[2][];
        numSum[0] = new int[array.length];
        numSum[1] = new int[array1.length];
        for (int i = 0; i < numSum.length; i++) {
            if (i == 0) {
                for (int j = 0; j < numSum[i].length; j++) {
                    numSum[i][j] = array[j];
                }
            } else if (i == 1) {
                for (int j = 0; j < numSum[i].length; j++) {
                    numSum[i][j] = array1[j];
                }
            }
        }
        return numSum;
    }
}

