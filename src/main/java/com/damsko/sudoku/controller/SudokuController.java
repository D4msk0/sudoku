package com.damsko.sudoku.controller;

import com.damsko.sudoku.model.SudokuGame;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sudoku")
public class SudokuController {

    private final SudokuGame sudokuGame;

    public SudokuController(SudokuGame sudokuGame) {
        this.sudokuGame = sudokuGame;
    }

    @GetMapping("/")
    public String showSudoku(Model model) {
        model.addAttribute("sudokuBoard", sudokuGame.getBoard());
        return "sudoku"; // Name of the HTML template
    }
}