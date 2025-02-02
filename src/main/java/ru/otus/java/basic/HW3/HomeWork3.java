package ru.otus.java.basic.HW3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int[][] arr0 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        int[][] arr1 = {{-5, -4, -3, -2, -1, 0, 1, 2, 3}, {4, 5, 6, 7, 8, 9}};
        int[][] array1 = {{1, -5, 4, -6, 7, 3, 8, 97, -36}, null, {10, 4, 6, -46, -55, 68,}};
        System.out.println(sumOfPositiveElements(array1));
        sqrtStar(10);
        diagonalInSqrt(new int[6][6]);
        System.out.println(findMax(arr1));
        System.out.println(sumRowOrColum(arr0));
    }

    public static int sumOfPositiveElements(int[][] array) {
        if (array == null) {
            return 0;
        }
        int sumArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] >= 0) {
                        sumArr += array[i][j];
                    }
                }
            }
        }
        return sumArr;
    }

    public static void sqrtStar(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                if (arr[i][j] == 1) {
                    System.out.print("*" + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void diagonalInSqrt(int[][] sqrt) {
        for (int i = 0; i < sqrt.length; i++) {
            for (int j = 0; j < sqrt[i].length; j++) {
                sqrt[i][j] = 1;
                if (i == j) {
                    sqrt[i][j] = 0;
                }
                if (sqrt.length - 1 - i == j) {
                    sqrt[i][j] = 0;
                }
                System.out.print(sqrt[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumRowOrColum(int[][] arr) {
        System.out.println("Какую сумму вы хотите найти?");
        System.out.println("1 - сумму второй строки");
        System.out.println("2 - сумму второго столбца");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (input == 1) {
            if (arr.length > 1) {
                int sumRow = 0;
                for (int j = 0; j < arr[1].length; j++) {
                    sumRow += arr[1][j];
                }
                return sumRow;
            }
        } else if (input == 2) {
            if (arr[0].length > 1) {
                int sumColum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sumColum += arr[i][1];
                }
                return sumColum;
            }

        }

        return -1;

    }
}
