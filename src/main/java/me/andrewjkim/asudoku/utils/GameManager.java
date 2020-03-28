package me.andrewjkim.asudoku.utils;

import java.util.HashMap;
import java.util.Random;

public class GameManager {

    int[][] sudokuBoard = {         //x mod 3
        {0,0,0,0,0,0,0,0,0},        //0, 1, 2, 0, 1, 2, 0, 1, 2
        {0,0,0,0,0,0,0,0,0},        //1
        {0,0,0,0,0,0,0,0,0},        //2
        {0,0,0,0,0,0,0,0,0},        //0
        {0,0,0,0,0,0,0,0,0},        //1
        {0,0,0,0,0,0,0,0,0},        //2
        {0,0,0,0,0,0,0,0,0},        //0
        {0,0,0,0,0,0,0,0,0},        //1
        {0,0,0,0,0,0,0,0,0}         //2
    };

    public GameManager() {
        generateWinningBoard();
        printBoard();
    }

    private boolean checkRow(int row, int checkValue) {
        for (int values : sudokuBoard[row-1]) {
            if (values == checkValue)
                return false;
        }
        return true;
    }

    private boolean checkColumn(int column, int checkValue) {
        for (int[] rows : sudokuBoard) {
            if (rows[column-1] == checkValue)
                return false;
        }
        return true;
    }

    private void generateWinningBoard() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                Random rnd = new Random();
                int randomSlot = rnd.nextInt(8)+1;
                //if (checkRow(x, x) && checkColumn(y, x))
                    sudokuBoard[randomSlot][y-1] = x;
            }
        }
    }

    private void printBoard() {
        for (int rows = 0; rows < sudokuBoard.length; rows++) {
            for (int columns = 0; columns < sudokuBoard[rows].length; columns++) {
                System.out.print(sudokuBoard[rows][columns]);
            }
            System.out.println();
        }
    }

// ATLEAST 17 NUMBERS, SO
// HARD 17
// MEDIUM 33
// EASY 50

    //The idea is to generate a "winning board", and then
    //delete 31 for easy, 48 for medium, 64 for hard
    /*

     _012_345_678_
   0 |xxx|xxx|xxx|
   1 |xxx|xxx|xxx|
   2 |xxx|xxx|xxx|
     _____________
   3 |xxx|xxx|xxx|
   4 |xxx|xxx|xxx|
   5 |xxx|xxx|xxx|
     _____________
   6 |xxx|xxx|xxx|
   7 |xxx|xxx|xxx|
   8 |xxx|xxx|xxx|
     _____________

     */
}
