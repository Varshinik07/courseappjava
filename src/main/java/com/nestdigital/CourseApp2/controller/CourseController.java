package com.nestdigital.CourseApp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/")
    public String Homepage(){
        return "Welocme to homepage";
    }

    @PostMapping("/read")
    public String Readpage(){
        return "Read page";
    }

    @GetMapping("/viewall")
 public List viewall(){
        List<String> myList=new ArrayList<>();
        myList.add("{'name':'john','age':20}");
        return myList;

    }
}
