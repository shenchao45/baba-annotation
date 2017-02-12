package com.shenchao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenchao.entity.BbsBrand;
import com.shenchao.entity.BbsBrandExample;
import com.shenchao.entity.Brand;
import com.shenchao.mapper.BbsBrandMapper;
import com.shenchao.mapper.BrandMapper;
import com.shenchao.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenchao on 2017/2/11.
 */
//@WebAppConfiguration
@ContextConfiguration(classes = {SpringConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMapper {
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private BbsBrandMapper bbsBrandMapper;

    @Test
    public void testPage(){
        PageHelper.startPage(2, 4);
        List<Brand> brandList = brandMapper.getBrandList(new Brand());
        PageInfo<Brand> pageInfo = new PageInfo<>(brandList);
        System.out.println(new ArrayList<>(pageInfo.getList()));
    }

    @Test
    public void testMapper(){
        BbsBrandExample example = new BbsBrandExample();
        BbsBrandExample.Criteria criteria = example.createCriteria();
        List<BbsBrand> bbsBrands = bbsBrandMapper.selectByExample(example);
        System.out.println(bbsBrands.size());
    }
    @Autowired
    private ProductService productService;
    @Test
    public void testProductMapper(){
    }

}
