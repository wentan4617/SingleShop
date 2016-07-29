package com.went.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by went on 16/7/28.
 */
//@Controller
public class ProductController {

    @RequestMapping(value = "/product/list.do")
    public String list(){
        return "/product/list";
    }
}
