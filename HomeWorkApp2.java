package ru.gb.java.homework1;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        boolean tenTwenty = within10and20(5, 15);
        System.out.println(tenTwenty);
        isPositiveOrNegative(4);
        boolean negative = isNegative(89);
        System.out.println(negative);
        printWordNTimes("Hello, world!", 2);


    }
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum >= 10 && sum <= 20;
    }
    public static void isPositiveOrNegative(int x) {
        if (x >=0) System.out.println("Передали положительно число");
        else {
            System.out.println("Передали отрицательное число");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) return true;
        else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        String repeatedWord = "";
        for (int i = 1; i <= times; i++) {
            repeatedWord = word;
            System.out.println(repeatedWord);
        }
    }
}
