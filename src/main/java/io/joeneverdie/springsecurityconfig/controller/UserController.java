package io.joeneverdie.springsecurityconfig.controller;

import io.joeneverdie.springsecurityconfig.service.MyUserDetailsService;
import io.joeneverdie.springsecurityconfig.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    MyUserDetailsService myUserDetailsService;

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome!</h1>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h1>Welcome user!</h1?";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h1>Welcome admin!</h1>";
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return myUserDetailsService.getAllUserByActive();
    }
}
