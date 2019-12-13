package com.one.web.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/con")
public class Controller {

    @GetMapping("/abc")
    public String abc(){
        return "adsfasfdasf";
    }

}
