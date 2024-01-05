package com.damsko.sudoku.model;

import org.springframework.stereotype.Component;

@Component
public class SudokuGame {

    private int[][] board;

    public SudokuGame(){
        initializeBoard();
    }

    public int[][] getBoard(){
        return board;
    }

    public void makeMove(int row, int col, int value) {
        // Implement logic to make a move in the Sudoku game
        // You might want to validate the move and update the board
    }

    private void initializeBoard(){
        // Simple example: Initialize the board with an empty Sudoku puzzle
        board = new int[][]{
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
    }
}
