package com.gurosemiproject.petales.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login_view")
    public String loginView(){
        return "user/userLoginView";
    }

    @GetMapping("/find_pass")
    public String findPass(){
        return "user/findPassView";
    }

    @GetMapping("/sign_up")
    public String signUpView(){
        return "user/signUpView";
    }
}
