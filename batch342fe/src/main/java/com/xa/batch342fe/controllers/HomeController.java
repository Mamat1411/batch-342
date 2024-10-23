package com.xa.batch342fe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("")
public class HomeController {
    
    @GetMapping("")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("home/index");
        view.addObject("title", "Home Page");
        return view;
    }
    
}