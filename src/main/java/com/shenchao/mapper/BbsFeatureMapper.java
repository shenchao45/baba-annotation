package com.shenchao.mapper;

import com.shenchao.entity.BbsFeature;
import com.shenchao.entity.BbsFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsFeatureMapper {
    int countByExample(BbsFeatureExample example);

    int deleteByExample(BbsFeatureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsFeature record);

    int insertSelective(BbsFeature record);

    List<BbsFeature> selectByExample(BbsFeatureExample example);

    BbsFeature selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsFeature record, @Param("example") BbsFeatureExample example);

    int updateByExample(@Param("record") BbsFeature record, @Param("example") BbsFeatureExample example);

    int updateByPrimaryKeySelective(BbsFeature record);

    int updateByPrimaryKey(BbsFeature record);
}