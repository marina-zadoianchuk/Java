package ru.gb.java.homework1;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        lenValue(5, 15);
    }

    public static void invertArray() {
        System.out.print("Invert 0/1\n");
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
       System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public static void fillArray() {
        System.out.print("Array 1-100\n");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void changeArray() {
        System.out.print("\n" + "Multiplication by 2\n");
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
            }
            else System.out.print(arr[i] + " ");
        }
    }
    public static void fillDiagonal() {
        System.out.print("\n" + "Square two-dimensional integer array\n");
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               if (i == j) {
                   arr[i][j] = 1;
               }
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void lenValue(int len, int initialValue){
        System.out.print("\n" + "Initial value\n");
        int[] arr = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}