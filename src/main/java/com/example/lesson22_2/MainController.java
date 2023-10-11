package com.example.lesson22_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    /*@RequestMapping("/home")
    public String home(@RequestParam(required = false) String color,
                       @RequestParam(required = false) String name,
                       Model model){
        model.addAttribute("username", name);
        model.addAttribute("color", color);
        return "home.html";
    }*/

    @RequestMapping("/home/{color}")
    public String home(@PathVariable String color,
                       Model model){
        model.addAttribute("username", "Katya");
        model.addAttribute("color", color);
        return "home.html";
    }

}
