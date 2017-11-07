package com.awareqwx.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController
{

    @RequestMapping("/")
    public String hello(@RequestParam(value="name", required=false) String name, Model model)
    {
        model.addAttribute("name", name == null ? "human" : name);
        return "hello.jsp";
    }
    
}
