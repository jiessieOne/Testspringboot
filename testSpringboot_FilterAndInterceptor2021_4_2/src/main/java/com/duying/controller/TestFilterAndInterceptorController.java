package com.duying.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestFilterAndInterceptorController  {


    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }

}
