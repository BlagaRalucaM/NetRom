package com.example.championship.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewCotroller {

    @GetMapping("/teams")
    public String teams() {
        return "index";
    }

    @GetMapping("/players")
    public String players(){
        return "players";
    }

    @GetMapping("/games")
    public String games(){
        return "games";
    }

}
