package com.danny.springsecuritydemo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public String home(){
        return "This is Home Page";
    }
    public String admin(){
        return "This is Admin Page";
    }
}
