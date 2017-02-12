package com.shenchao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenchao.entity.Brand;
import com.shenchao.mapper.BrandMapper;
import com.shenchao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenchao on 2017/2/12.
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> getBrandList(Brand brand) {
        return brandMapper.getBrandList(brand);
    }

    @Override
    public PageInfo<Brand> getBrandListWithPage(int pageNo, int pageSize, Brand brand) {
        PageHelper.startPage(pageNo, pageSize);
        return new PageInfo<>(brandMapper.getBrandList(brand));
    }

    @Override
    public void save(Brand brand) {
        brandMapper.save(brand);
    }

    @Override
    public void delete(Integer id) {
        brandMapper.delete(id);
    }

    @Override
    public void deleteByIds(ArrayList<Integer> ids) {
        brandMapper.deleteByIds(ids);
    }

    @Override
    public Brand findById(Integer id) {
        return brandMapper.findById(id);
    }

    @Override
    public void update(Brand brand) {
        brandMapper.update(brand);
    }
}
