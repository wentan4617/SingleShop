package com.went.core.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by went on 16/7/28.
 *
 */
@Controller
@RequestMapping(value = "/center")
public class FrameController {

    @RequestMapping(value = "/frame/product_main.do")
    public String main(){
        return "/frame/product_main";
    }

    @RequestMapping(value = "/frame/product_left.do")
    public String left(){
        return "/frame/product_left";
    }

}
