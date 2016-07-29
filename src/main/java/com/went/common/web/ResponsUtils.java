package com.went.common.web;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by went on 16/7/30.
 */
public class ResponsUtils {

    public static void render(HttpServletResponse response, String contentType, String text){
        response.setContentType(contentType);
        try {
            response.getWriter().write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //JSON
    public static void renderJson(HttpServletResponse response, String text){
        render(response,"application/json;charset=UTF-8",text);
    }

    //XML
    public static void renderXml(HttpServletResponse response, String text){
        render(response,"text/xml;charaset=UTF-8",text);
    }

    //Text
    public static void renderText(HttpServletResponse response, String text){
        render(response,"text/plain;charset=UTF-8",text);
    }
}
