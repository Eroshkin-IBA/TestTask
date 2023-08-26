package com.example.testtask.controller;

import com.example.testtask.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class MainController {

    UserService userService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("users", userService.getAll());
        return "main";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
