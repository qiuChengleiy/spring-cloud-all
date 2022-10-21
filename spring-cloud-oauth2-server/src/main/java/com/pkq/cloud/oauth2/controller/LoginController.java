package com.pkq.cloud.oauth2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qcl
 * @Description
 * @Date
 */
@RestController
@RequestMapping("user")
public class LoginController {

    @PostMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/authorize")
    public String authorize() {
        return "";
    }
}
