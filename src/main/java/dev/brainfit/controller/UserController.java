package dev.brainfit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.brainfit.security.CurrentUser;
import dev.brainfit.security.CustomUser;

@RestController
public class UserController {
    @GetMapping("/user")
    public CustomUser user(@CurrentUser CustomUser currentUser) {
        return currentUser;
    }
}
