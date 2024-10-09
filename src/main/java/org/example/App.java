package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {       //uncomment the method you  would like to check
        // printThreeWords();
        // checkSumSign();
        // printColor();
        // compareNumbers();
        // System.out.println(isSumInRange(0,11));
        // printPositiveOrNegative(11);
        // System.out.println(isNumberNegative(-1));
        // printStringXTimes("cat ", 8);
        // System.out.println(isLeapYear(2020));
        // System.out.println(Arrays.toString(changeArray()));
        // System.out.println(Arrays.toString(createArray()));
        // System.out.println(Arrays.toString(multiplyIfLessThanSix()));
        /* int [][] array = createMatrix();
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        } */
        // System.out.println(Arrays.toString(fillArrayWithValue(7, 5)));
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 5;
        int b = 0;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 11;
        int b = 21;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    static void printPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static boolean isNumberNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    static void printStringXTimes(String a, int x) {
        System.out.println(a.repeat(x));
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    static int[] changeArray() {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    static int[] createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    static int[] multiplyIfLessThanSix() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    static int[][] createMatrix() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (i == a) {
                    array[i][a] = 1;
                } else if (i + a == array.length - 1) {
                    array[i][a] = 1;
                }
            }
        }
        return array;
    }

    static int[] fillArrayWithValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int a = 0; a < array.length; a++) {
            array[a] = initialValue;
        }
        return array;
    }
}
