package com.went.core.service.product;

import cn.itcast.common.page.Pagination;
import com.went.core.bean.Brand;

import java.util.List;

/**
 * Created by went on 16/7/29.
 */
public interface BrandService {
    Pagination getBrandListWithPage(Brand brand);
}
