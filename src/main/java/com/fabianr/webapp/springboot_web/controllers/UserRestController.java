package com.fabianr.webapp.springboot_web.controllers;

import com.fabianr.webapp.springboot_web.models.User;
import com.fabianr.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Fabian", "Ruiz");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo spring boot!!!!!!!!");
        return userDto;
    }
}

//@GetMapping("/details")
//public Map<String, Object> details() {
//    User user = new User("Fabian", "Ruiz");
//    Map<String, Object> body = new HashMap<>();
//    body.put("title", "Hola mundo spring boot!!!!!!!!");
//    body.put("user", user);
//    return body;
//}