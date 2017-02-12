package com.shenchao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenchao.entity.BbsProduct;
import com.shenchao.entity.BbsProductExample;
import com.shenchao.mapper.BbsProductMapper;
import com.shenchao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * Created by shenchao on 2017/2/12.
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private BbsProductMapper productMapper;

    @Override
    public PageInfo<BbsProduct> findProducts(int pageNo, int pageSize, BbsProduct product) {
        PageHelper.startPage(pageNo, pageSize);
        BbsProductExample example = new BbsProductExample();
        BbsProductExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(product.getName())) {
            criteria.andNameLike(product.getName());
        }
        if (product.getIsShow() != null) {
            criteria.andIsShowEqualTo(product.getIsShow());
        }
        return new PageInfo<>(productMapper.selectByExample(example));
    }
}
