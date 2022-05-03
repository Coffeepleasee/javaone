package Lection3;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        changeZeroToOne(10);
        System.out.println("Задание 2");
        createArr123();
        System.out.println("Задание 3");
        createArrMultiply();
        System.out.println("Задание 4");
        createArrDiagonal();
        System.out.println("Задание 5");
        createArrXY(7, 8);
        System.out.println("Задание 6");
        createArrMM(11);
    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // *С помощью цикла и условия заменить 0 на 1, 1 на 0.
    public static Random random = new Random();

    public static void changeZeroToOne(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
    }

    // 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.
    public static void createArr123() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2 в массиве.
    public static void createArrMultiply() {
        int arr[] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println(" ");
    }

    //4. Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n].
    public static void createArrDiagonal() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i == j) || (i + j == arr.length - 1) ? 1 : 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    public static void createArrXY(int len, int initialValue) {
        int[] arr = new int[len];
        for (len = 0; len < arr.length; len++) {
            arr[len] = initialValue;
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    // 6. Задать одномерный массив и найти в нем минимальный и максимальный значения элементов.
    public static void createArrMM(int k) {
        int[] arr = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-800,800);
        }
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int c = arr[0];
        //  arr[i][j] = (i == j) || (i + j == arr.length - 1) ? 1 : 0;
        for (int i = 0; i < arr.length; i++) {
           c= (c<arr[i])? arr[i]:c;
            }
        System.out.println("Максимальное значение =" + c);
        for (int i = 0; i < arr.length; i++) {
            c= (c>arr[i])? arr[i]:c;
        }
        System.out.println("Минимальное значение =" + c);
        }
}




