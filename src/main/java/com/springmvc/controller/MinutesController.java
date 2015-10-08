package com.springmvc.controller;

import com.springmvc.model.Exercise;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jbrooks on 08/10/2015.
 */
@Controller
public class MinutesController {
    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute ("exercise") Exercise exercise, Model model){
        model.addAttribute("title", "Add minutes");
        return "addMinutes";
    }
}
