package com.xin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Lucas
 * @Date 2019/12/16 11:08
 * @Version 1.0
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value = {"", "login.html"})
    public String login() {
        return "login";
    }

    @RequestMapping(value="success.html")
    public String success(String username,Model model) {
        model.addAttribute("message",username);
        return "success";
    }
}

