package com.damsko.sudoku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SudokuController {

    @GetMapping("/")
    public String showSudoku(Model model){
        return "index"; // Name of the HTML template
    }

}
