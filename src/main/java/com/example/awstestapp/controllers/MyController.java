package com.example.awstestapp.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controller")
public class MyController {

  @GetMapping("/method")
  public String getMethod(){
    return "Hello";
  }
}
