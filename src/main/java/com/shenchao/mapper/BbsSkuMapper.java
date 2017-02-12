package com.shenchao.mapper;

import com.shenchao.entity.BbsSku;
import com.shenchao.entity.BbsSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsSkuMapper {
    int countByExample(BbsSkuExample example);

    int deleteByExample(BbsSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsSku record);

    int insertSelective(BbsSku record);

    List<BbsSku> selectByExample(BbsSkuExample example);

    BbsSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsSku record, @Param("example") BbsSkuExample example);

    int updateByExample(@Param("record") BbsSku record, @Param("example") BbsSkuExample example);

    int updateByPrimaryKeySelective(BbsSku record);

    int updateByPrimaryKey(BbsSku record);
}