package com.shenchao.service;

import com.github.pagehelper.PageInfo;
import com.shenchao.entity.BbsProduct;

/**
 * Created by shenchao on 2017/2/12.
 */
public interface ProductService {
    PageInfo<BbsProduct> findProducts(int pageNo, int pageSize, BbsProduct product);
}
