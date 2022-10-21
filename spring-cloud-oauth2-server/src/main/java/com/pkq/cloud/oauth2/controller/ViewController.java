package com.pkq.cloud.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author qcl
 * @Description
 * @Date
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @RequestMapping("/login")
    public String loginView(Model model) {
        return "oauth-login";
    }

    @RequestMapping("/authorize")
    public String authorizeView(Model model) {
        return "oauth-authorize";
    }

    @RequestMapping("/oauth/error")
    public String errorView(Model model) {
        return "oauth-error";
    }
}
