package com.went.core.dao.product;

import com.went.core.bean.Brand;

import java.util.List;

/**
 * Created by went on 16/7/29.
 */
public interface BrandDao {

    /**
     * 查询品牌列表并封装分页信息
     * @return 品牌列表
     */
    List<Brand> getBrandListWithPage(Brand brand);

    int getBrandCount(Brand brand);
}
