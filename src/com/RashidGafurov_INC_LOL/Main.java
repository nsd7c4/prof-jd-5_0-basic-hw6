package com.RashidGafurov_INC_LOL;

//import java.sql.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int[] januaryExpenses = generateRandomArray();
        int sumExpenses = 0;
        for (int i : januaryExpenses) {
            sumExpenses += i;
        }
        System.out.println("Sum of all expenses is " + sumExpenses + " rubles.");

        //Assignment 2
        int minExpense = januaryExpenses[1];
        int maxExpense = januaryExpenses[1];
        for (int i : januaryExpenses) {
            if (i < minExpense) {
                minExpense = i;
            }
            if (i > maxExpense) {
                maxExpense = i;
            }
        }

        System.out.print("Maximum expenses for a day is " + maxExpense + " rubles. ");
        System.out.println("Minimal expenses for a day is " + minExpense + " rubles.");

        //Assignment 3
        float averageExpense = sumExpenses / januaryExpenses.length;
        System.out.println("Average expenses for a month is " + averageExpense + " rubles.");

        //Assignment 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //Assignment 5
        int[][] array3x3 = new int[3][3];
        for (int i = 0; i < array3x3.length; i++) {
            array3x3[i][i] = 1;
            array3x3[i][array3x3.length - i - 1] = 1;
        }

        for (int[] row : array3x3) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Assignment 6
        int[] array6 = {17, 12, 99, 23, 43};
        int[] invertedArray6 = new int[array6.length];
        for (int i = 0; i < array6.length; i++) {
            invertedArray6[invertedArray6.length - 1 - i] = array6[i];
        }
        System.out.println(Arrays.toString(array6));
        System.out.println(Arrays.toString(invertedArray6));

        //Assignment 7
        int tempV;
        for (int i = 0; i < array6.length / 2; i++) {
            tempV = array6[i];
            array6[i] = array6[array6.length - i - 1];
            array6[array6.length - i - 1] = tempV;
        }
        System.out.println(Arrays.toString(array6));

        //Assignment 8
        int[] array8 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        boolean isNumbersFound = false;
        for (int i : array8) {
            for (int j : array8) {
                if (i + j == -2 && i != j) {
                    System.out.println("First number is " + i + ". Second Number is " + j);
                    isNumbersFound = true;
                    break;
                }
            }
            if (isNumbersFound) {
                break;
            }
        }

        //Assignment 9
        int[] array9 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        //int[] array9 = {-1, -2, -3, -4, -5, -6, 4, 2};
        //Arrays.sort(array9);
        System.out.println(Arrays.toString(array9));
        for (int i = 0; i < array9.length; i++) {
            for (int j = array9.length-1; j > i; j--) {
                if (array9[i] + array9[j] == -2 && array9[i] != array9[j]) {
                    System.out.println("First number is " + array9[i] + ". Second Number is " + array9[j]);
                }
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
