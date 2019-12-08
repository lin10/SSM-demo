package com.hand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String say(){
        return "hello";
    }

    @RequestMapping("/onezero")
    public String one(){
        return "one";
    }

    @RequestMapping("/zero")
    public String zero(){
        return "onezero";
    }
}
