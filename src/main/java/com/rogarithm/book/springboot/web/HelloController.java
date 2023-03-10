package com.rogarithm.book.springboot.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path="/hello", method=GET)
    public String hello() {
        return "hello";
    }

}
