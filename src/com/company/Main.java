package com.company;

import java.util.Arrays;

public class Main {

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void main(String[] args) {

        // 11111
        double numbers[] = {8, -2, -4, 2, 3, 6};//11/3=3.6666666666666665
        double res = 0;
        int col = 0;
        boolean isOtr = false;
        for (double el : numbers) {
            if (el < 0) {
                isOtr = true;
            } else {
                if (isOtr) {
                    col++;
                    res = res + el;
                }
            }
        }
//        System.out.println(res / col);
 //2222222222

        int[] array = {-4, -6,-2, 9,2, 3, 6, 8};
//        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i-1);
            }
            System.out.println(Arrays.toString(array));
        }

    }
}

