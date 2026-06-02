package com.blog.blogapp.controller;

import com.blog.blogapp.model.HelloResponse;

import javax.swing.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Blog API Running";
    }

    // @GetMapping("/hello")
    // public String hello(){
    //     return "Hello Adarsh";
    //     //or another method to test the api
    // }
    
    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse(
                "Hello Adarsh",
                "success"
        );
    }
    // What Just Happened above ?
    // You returned a Java object: new HelloResponse(...)
    // Spring automatically converted it into JSON.
    // This automatic conversion is one of the major features provided by Spring Web.
    
}
// | URL                  | Mapping  |
// | -------------------- | -------- |
// | localhost:8080       | `/`      |
// | localhost:8080/users | `/users` |
// | localhost:8080/posts | `/posts` |
