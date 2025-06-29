package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class HelloController {



    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/members")
    public List<String> getMembers() {

        List<String> list = new ArrayList<>();
        list.add("김연서");
        list.add("이지예");
        list.add("박성호");
        return list;
    }
}
