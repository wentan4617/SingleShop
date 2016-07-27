package com.went.core.web;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by went on 16/7/28.
 * 自定义日期格式识别
 */
public class CustomDateFormat implements WebBindingInitializer {


    public void initBinder(WebDataBinder binder, WebRequest request) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class,new CustomDateEditor(df,true));
    }
}
