package com.went.core.controller.admin;

import cn.itcast.common.page.Pagination;
import com.went.core.bean.Brand;
import com.went.core.service.product.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by went on 16/7/28.
 */
@Controller
@RequestMapping(value = "/center")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "/brand/list.do")
    public String list(String name, Integer pageNo, Integer isDisplay, ModelMap model){

        //前台要用的查询参数
        StringBuilder param = new StringBuilder();
        //后台要用的查询参数
        Brand brand = new Brand();
        //isDispaly默认是1,不管选择与否可定you值
        if (isDisplay == null){
            isDisplay = 1;
        }
        param.append("isDisplay=" + isDisplay);
        brand.setIsDisplay(isDisplay);
        if(StringUtils.isNotBlank(name)){
            param.append("&name="+name);
            brand.setName(name);
            model.addAttribute("name",name);
        }

        brand.setPageNo(Pagination.cpn(pageNo));
        brand.setPageSize(5);
        Pagination pagination = brandService.getBrandListWithPage(brand);
        String url = "/center/brand/list.do";
        pagination.pageView(url,param.toString());

        model.addAttribute("isDisplay",isDisplay);
        model.addAttribute("pagination",pagination);
        return "/brand/list";
    }

    @RequestMapping(value = "/brand/toAdd.do")
    public String toAdd(){
        return "/brand/add";
    }

}

















