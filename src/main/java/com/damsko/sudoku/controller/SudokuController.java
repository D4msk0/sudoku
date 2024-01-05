package com.damsko.sudoku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SudokuController {

    @RequestMapping("/")
    public String showSudoku(){
        return "index"; // Name of the HTML template
    }

}
