package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MotosContoroller {
    @RequestMapping(value="/motos", method=RequestMethod.GET)
    public String hello(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }
        
}
