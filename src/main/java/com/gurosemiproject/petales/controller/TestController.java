package com.gurosemiproject.petales.controller;

import com.gurosemiproject.petales.service.ComService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private ComService comService;

    @GetMapping("test")
    public ModelAndView comLocat(ModelAndView mv) {
        String location = comService.comLocat();

        mv.addObject("location", location);
        mv.setViewName("schedule/test");

        return mv;
    }
}
