package com.almod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(Model model){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss d MMMM y");

        model.addAttribute("date", simpleDateFormat.format(date));
        return "test";
    }
}
