package com.shenchao.service;

import com.github.pagehelper.PageInfo;
import com.shenchao.entity.Brand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenchao on 2017/2/11.
 */
public interface BrandService {
    public List<Brand> getBrandList(Brand brand);

    public PageInfo<Brand> getBrandListWithPage(int pageNo, int pageSize,Brand brand);

    public void save(Brand brand);

    public void delete(Integer id);

    public void deleteByIds(ArrayList<Integer> ids);

    public Brand findById(Integer id);

    public void update(Brand brand);
}
