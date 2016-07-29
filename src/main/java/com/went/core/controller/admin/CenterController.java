package com.went.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by went on 16/7/28.
 * 进入后台首页的Controller
 */
@Controller
@RequestMapping(value = "/center")
public class CenterController {

    //后台入口
    @RequestMapping(value = "/index.do")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/top.do")
    public String top(){
        return "top";
    }

    @RequestMapping(value = "/main.do")
    public String main(){
        return "main";
    }

    @RequestMapping(value = "/left.do")
    public String left(){
        return "left";
    }

    @RequestMapping(value = "/right.do")
    public String right(){
        return "right";
    }
}
