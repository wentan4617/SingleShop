package com.went.core.controller.admin;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.went.common.web.ResponsUtils;
import com.went.core.web.Constants;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by went on 16/7/30.
 */
@Controller
@RequestMapping(value = "/upload")
public class UploadController {

    @RequestMapping(value = "/uploadPic.do")
    public void uploadPic( @RequestParam(required = false) MultipartFile pic, HttpServletResponse response) {
        //图片扩展名
        String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
        //图片名称生成策略
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String format = df.format(new Date());
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            format += r.nextInt();
        }

        //用jersey上传到服务器(可以是本地服务器也可以是单独的图片服务器)
        Client client = new Client();
        String path = "upload/" + format + "." + ext;
        String fullUrl = Constants.IMAGE_UPLOAD_URL + path;
        WebResource resource = client.resource(fullUrl);
        try {
            resource.put(String.class, pic.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("url",fullUrl);
        jsonObject.put("path",path);

        ResponsUtils.renderJson(response,jsonObject.toString());

    }



}