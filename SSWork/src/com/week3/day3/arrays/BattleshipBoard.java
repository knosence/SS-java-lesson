package com.week3.day3.arrays;

import java.rmi.server.ExportException;

public class BattleshipBoard {

    public static final int ROWS = 7;
    public static final int COLS = 11;

    private String[][] gameBoard;

    public BattleshipBoard() {
        this.gameBoard = new String[ROWS][11];
        // ship 1
        gameBoard[0][3] = "ship";
        gameBoard[0][4] = "ship";
        // ship 2
        gameBoard[2][2] = "ship";
        gameBoard[3][2] = "ship";
        gameBoard[4][2] = "ship";
        // ship
        gameBoard[4][6] = "ship";
        gameBoard[4][7] = "ship";
        gameBoard[4][8] = "ship";
        gameBoard[4][9] = "ship";




    }

    public boolean isHit(int row, int col) throws Exception {
        if (row < 0 || row >= ROWS) throw new Exception("Rows must be between 0 and " + ROWS);
        if (col < 0 || col >= COLS) throw new Exception("Column must be between 0 and " + COLS);

        String contents = gameBoard[row][col];
        System.out.println(contents);
        if (contents == null) {
            gameBoard[row][col] = "Miss!!";
            return false;
        }

        boolean hit = contents.equals("ship");
        if (hit) {
            gameBoard[row][col] = "HIT!!";
            return true;
        } else {
            if (contents.equals("HIT!!") || contents.equals("Miss!!"))
                throw new Exception("you already guessed this and it was " + contents);
        }

        return hit;
    }

    public static void main(String[] args) {
        BattleshipBoard board = new BattleshipBoard();
        // guess
        try {
            boolean guess = board.isHit(4, 9); // a hit
            System.out.println("Guess 4, 9 is a hit?" + guess);
            boolean guess1 = board.isHit(0, 0); // a miss
            System.out.println("Guess 0, 0 is a hit?" + guess1);
            //boolean guess4 = board.isHit(10, 10); //exception
            //System.out.println("Guess 10, 10 is a hit?" + guess4);
            boolean guess3 = board.isHit(4, 9); // a hit
            System.out.println("Guess 4, 9 is a hit?" + guess3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
