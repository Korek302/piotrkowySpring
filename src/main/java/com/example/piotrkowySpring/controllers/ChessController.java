package com.example.piotrkowySpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChessController {

    @RequestMapping("/chess")
    public String index() {
        return "chess.html";
    }

}