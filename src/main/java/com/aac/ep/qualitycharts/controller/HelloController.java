package com.aac.ep.qualitycharts.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index()
    {
        System.out.println("123");
        return  "hello ramos!";
    }
}
