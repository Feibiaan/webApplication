package com.fabianr.webapp.springboot_web.controllers;

import com.fabianr.webapp.springboot_web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Fabian", "Ruiz");
        model.addAttribute("title", "Hola mundo spring boot!!!!!!!!");
        model.addAttribute("user", user);
        return "details";
    }
}
