package com.example.mohan_schools.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"","/","/home"})
    public String displayHome(Model model){
        model.addAttribute("username","John Doe");
        return "home.html";
    }

}
