package com.xin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Lucas
 * @Date 2019/12/16 10:04
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    private String USERSERVICE_URL="http://localhost:9999/user";

    @RequestMapping("/login")
    public Map login(String username, String password) {
        System.out.println("---login---");
        System.out.println("username:" + username + "  password:" + password);
        Map<String,String> params = new HashMap<String,String>();
        params.put("username",username);
        params.put("password",password);
        //发送GET请求
        User user = restTemplate.getForObject(USERSERVICE_URL+"/{username}/{password}",User.class,params);
        Map<String, Object> result = new HashMap<>();
        if(user != null) {
            result.put("success",true);
        } else {
            result.put("success",false);
            result.put("message","登录失败！");
        }
        return result;
    }

    @RequestMapping("/regist")
    public ResResult login(@RequestBody User user) throws IOException {
        return restTemplate.postForObject(USERSERVICE_URL+"/",user,ResResult.class);
    }

    //清空所有账户密码
    @RequestMapping("/clean")
    public Map clean() throws IOException {
        Map<String, Object> result = new HashMap<>();
        Boolean forObject = restTemplate.getForObject(USERSERVICE_URL + "/clean", boolean.class, (Object) null);
        result.put("success",forObject);
        return result;
    }
}
