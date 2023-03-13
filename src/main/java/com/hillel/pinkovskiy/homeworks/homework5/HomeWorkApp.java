package com.hillel.pinkovskiy.homeworks.homework5;

public abstract class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor(46);
        compareNumbers(5, 10);
        System.out.println(isSumInRange(5, 10));
        printNumberSign(0);
        System.out.println(isNegative(-5));
        printStringNTimes("Hello", 3);
        System.out.println(isLeapYear(2023));
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Додатнє число");
        } else {
            System.out.println("Від'ємне число");
        }
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
