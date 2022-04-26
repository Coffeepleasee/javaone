package Lection1.homework;

public class HomeWorkApp {

    public static void main(String [] args) {
        System.out.println("Задание 1");
        printThreeWords();
        System.out.println("Задание 2");
        checkSumSign();
        System.out.println("Задание 3");
        printColor();
        System.out.println("Задание 4");
        compareNumbers();
    }
// Задание 1 - Вывод строки
        public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // Задание 2 - Вывод строки + мат.операции+ условие
    public static void checkSumSign() {
        int a=10, b=20;
        int c = a+b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задание 3 - Вывод названия цвета по сложному условию
    public static void printColor () {
        int value=5;
                if (value <= 0) {
                    System.out.println("Красный");
                }
                else if ( value >= 0 || value <= 100 ) {
            System.out.println("Желтый");
        } else if (value >= 100) {
            System.out.println("Зеленый");
        }
        }
    // Задание 4 - Вывод по условию сравнения
    public static void compareNumbers () {
        int a=-1, b=35;
        if (a>=b) {
            System.out.println("a >= b");
        } else {System.out.println("a < b");}
    }
}
