package com.went.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by went on 16/7/28.
 */
@Controller
public class ProductController {

    @RequestMapping(value = "/test/springmvc.do")
    public String test(String name, Date birthday){

        System.out.printf("");
        return "";
    }
}
