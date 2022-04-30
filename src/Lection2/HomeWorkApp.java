package Lection2;

public class HomeWorkApp {
    public static void main(String [] args) {
        System.out.println("Задание 1");
        System.out.println(checkSum(2,8));
        System.out.println("Задание 2");
        System.out.println(checkSign1 (-35) );
        System.out.println("Задание 3");
        System.out.println(checkSign2 (-35) );
        System.out.println("Задание 4");
        textForPrint ("проба пера");
        System.out.println("Задание 5");
        System.out.println(leapYear (2021));
    }
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true,
    public static boolean checkSum (int a, int b) {
        return (a+b) >= 10 && (a+b) <=20;
  }
  // 2. Написать метод, которому в качестве параметра передается целое число,
  //метод должен напечатать в консоль, положительное ли число передали или отрицательное.
  //Замечание: ноль считаем положительным числом.
    public static boolean checkSign1 (int c) {
        return c >= 0;
    }
    // 3. Написать метод, которому в качестве параметра передается целое число.
    //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkSign2 (int c) {
        return c <= 0;
    }
// 4. Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void textForPrint (String f) {
    for (int i= 0; i < 10; i++) {
    System.out.println(f);
    }
    }
    // 5.* Написать метод, который определяет, является ли год високосным,
    //и возвращает boolean (високосный - true, не високосный - false).
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
   public static boolean leapYear (int y){
        return y%45 == 0 && y%100 !=0 || y%400 == 0;
   }
}
