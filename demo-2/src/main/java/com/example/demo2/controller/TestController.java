package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author qihenan
 * @Date 2021/7/21 14:51
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello world";
    }
}