package com.fabianr.webapp.springboot_web.controllers;

import com.fabianr.webapp.springboot_web.models.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("Fabian", "Ruiz");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo spring boot!!!!!!!!");
        body.put("user", user);
        return body;
    }
}
