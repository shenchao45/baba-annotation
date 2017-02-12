package com.shenchao.mapper;

import com.shenchao.entity.Brand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shenchao on 2017/2/11.
 */
public interface BrandMapper {
    List<Brand> getBrandList(Brand brand);

    void save(Brand brand);

    void delete(Integer id);

    void deleteByIds(ArrayList<Integer> ids);

    Brand findById(Integer id);

    void update(Brand brand);
}
