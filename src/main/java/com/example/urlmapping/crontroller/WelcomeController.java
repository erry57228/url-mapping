package com.example.urlmapping.crontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/greet")
    public String greeting (Model model){
        model.addAttribute("tagline","HelloSpring");
        return "welcome";
    }
    @GetMapping("/sayspring")
    public String saySpring(Model model){
        model.addAttribute("tagline","Say Spring Mvc");
        return "welcome";
    }
    @GetMapping("/")
    public String welcome (Model model){
        model.addAttribute("tagline","Welcome Spring");
        return "welcome";
    }
}
