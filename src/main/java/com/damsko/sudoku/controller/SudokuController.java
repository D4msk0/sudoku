package com.damsko.sudoku.controller;

import com.damsko.sudoku.model.SudokuGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sudoku")
public class SudokuController {

    private final SudokuGame sudokuGame;

    @Autowired
    public SudokuController(SudokuGame sudokuGame) {
        this.sudokuGame = sudokuGame;
    }

    @GetMapping("/")
    public String showSudoku(Model model){
        model.addAttribute("sudokuBoard", sudokuGame.getBoard());
        return "sudoku"; // Name of the HTML template
    }

    @PostMapping("/makeMove")
    public String makeMove(int row, int col, int value, Model model) {
        sudokuGame.makeMove(row, col, value);
        model.addAttribute("sudokuBoard", sudokuGame.getBoard());
        return "sudoku"; // Redirect back to the Sudoku page
    }

}
