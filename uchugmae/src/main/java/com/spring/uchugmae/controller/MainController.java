package com.spring.uchugmae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    


    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }


    @GetMapping("/index")
    public String index(){
        return "index";
    }
    

}

