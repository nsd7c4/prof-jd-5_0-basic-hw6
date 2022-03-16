package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int januaryExpenses[] = generateRandomArray();
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
            if (i > maxExpense){
                maxExpense = i;
            }
        }

        System.out.print("Maximum expenses for a day is " + maxExpense + " rubles. ");
        System.out.println("Minimal expenses for a day is " + minExpense +" rubles.");

        //Assignment 3
        float averageExpense = sumExpenses / (januaryExpenses.length-1);
        System.out.println("Average expenses for a month is " + averageExpense + " rubles.");

        //Assignment 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
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
