package com.chieyoun.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/d-ups.html")
    public String dups() {
        return "d-ups";
    }

    @GetMapping("/r-ups.html")
    public String rups() {
        return "r-ups";
    }

    @GetMapping("/hfu.html")
    public String hfu() {
        return "hfu";
    }

    @GetMapping("/aiu-n.html")
    public String aiun() {
        return "aiu-n";
    }

    @GetMapping("/aiu.html")
    public String aiu() {
        return "aiu";
    }
}