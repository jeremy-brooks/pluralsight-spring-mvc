package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jbrooks on 08/10/2015.
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model){

        model.addAttribute("greeting", "Hello world");
        model.addAttribute("title", "Fitness app");

        return "hello";
    }
}
