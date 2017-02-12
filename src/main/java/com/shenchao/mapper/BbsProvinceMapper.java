package com.shenchao.mapper;

import com.shenchao.entity.BbsProvince;
import com.shenchao.entity.BbsProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsProvinceMapper {
    int countByExample(BbsProvinceExample example);

    int deleteByExample(BbsProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsProvince record);

    int insertSelective(BbsProvince record);

    List<BbsProvince> selectByExample(BbsProvinceExample example);

    BbsProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsProvince record, @Param("example") BbsProvinceExample example);

    int updateByExample(@Param("record") BbsProvince record, @Param("example") BbsProvinceExample example);

    int updateByPrimaryKeySelective(BbsProvince record);

    int updateByPrimaryKey(BbsProvince record);
}