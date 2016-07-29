package com.went.core.service.product;

import cn.itcast.common.page.Pagination;
import com.went.core.bean.Brand;
import com.went.core.dao.product.BrandDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by went on 16/7/29.
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandDao brandDao;

    @Transactional(readOnly = true)
    public Pagination getBrandListWithPage(Brand brand) {
        int total = brandDao.getBrandCount(brand);
        Pagination pagination = new Pagination(brand.getPageNo(),brand.getPageSize(),total);
        pagination.setList(brandDao.getBrandListWithPage(brand));
        return pagination;
    }
}
