package com.pkq.cloud.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qcl
 * @Description 测试
 * @Date
 */
@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping(value = "1")
    public String hello1(){

        return "hello1";
    }
}
