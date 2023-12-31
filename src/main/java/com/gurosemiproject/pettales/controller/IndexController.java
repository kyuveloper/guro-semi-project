package com.gurosemiproject.pettales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "/";
    }

    @GetMapping("comInfo")
    public String comInfo() {
        return "schedule/com_info";
    }

}
