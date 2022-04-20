package ru.gb.java.homework1;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    Random random;
    Scanner scanner;
    char[][] table;

    TicTacToe(){
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game(){
        System.out.println("Game is started!");
        initTable();
        printTable();

        while(true){
            turnHuman();
            if(checkWin('x')){
                printTable();
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                printTable();
                System.out.println("AI WON!");
                break;
            }
        }
    }

    boolean isTableFull() {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[x][y] == '.') return false;
            }
        }
        return true;
    }

    boolean checkWin(char symbol) {
        boolean cols, rows;
        for (int x = 0; x < 3; x++) {
            cols = true;
            rows = true;
            for (int y = 0; y < 3; y++) {
                cols &= (table[x][y] == symbol);
                rows &= (table[y][x] == symbol);
            }

            /* Это условие после каждой проверки колонки и столбца
            позволяет остановить дальнейшее выполнение, без проверки
            всех остальных столбцов и строк.
             */
            if (cols || rows) return true;
        }
        return false;
    }


        void turnHuman() {
        int x, y;

        do{
            System.out.println("Enter x y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
            //System.out.println(x + ", " + y);
        } while (!isCellValid(x, y));
        table[x][y] = 'x';
        /*System.out.println("Enter x y from [0..2]");
        x = scanner.nextInt();
        y = scanner.nextInt();
        if(isCellValid(x, y)) table[x][y] = 'x';
        else turnHuman();*/
    }

    boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '.';
    }

    void turnAI() {
        int x, y;

        do{
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    void initTable(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
}
