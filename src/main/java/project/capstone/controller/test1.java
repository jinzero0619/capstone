package project.capstone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {

    @RequestMapping("/test1")
    public String test1(){
        System.out.println("test1");
        return "test1";
    }
}
