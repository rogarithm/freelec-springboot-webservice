package com.rogarithm.book.springboot.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.rogarithm.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(path="/hello", method=GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(path = "/hello/dto", method = GET)
    public HelloResponseDto helloDto(@RequestParam(name="name") String name,
            @RequestParam(name="amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
