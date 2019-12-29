package com.example.demo;

import com.example.services.WelcomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {


    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService=welcomeService;
    }



    @RequestMapping("/welcome")
    public String showWelcome(Model model){
        model.addAttribute("welcomeMsg",welcomeService.generateWelcomeMessage());
        model.addAttribute("persons",welcomeService.findAll());
        return "welcome";
    }
}
