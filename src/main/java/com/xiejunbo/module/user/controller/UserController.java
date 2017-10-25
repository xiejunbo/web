package com.xiejunbo.module.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiejunbo
 * @version 1.0.0
 * @date 2017/10/25
 */
@Controller
@RequestMapping("user")
public class UserController {

    @ResponseBody
    @RequestMapping("getUser")
    public Map<String, Object> getUser(){
        Map<String, Object> resutMap = new HashMap<>();
        resutMap.put("name", "xiejunbo");
        resutMap.put("hello", "world");
        return resutMap;
    }

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("name", "xiejunbo");
        request.setAttribute("hello", "world");
        return "index";
    }


}
