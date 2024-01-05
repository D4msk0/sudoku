package com.damsko.sudoku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SudokuController {

    @RequestMapping("/")
    public String showSudoku(){
        return "index"; // Name of the HTML template
    }

}
