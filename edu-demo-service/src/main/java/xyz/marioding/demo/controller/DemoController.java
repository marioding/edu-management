package xyz.marioding.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/aaa")
    public String sss(){
        return "success";
    }

}
