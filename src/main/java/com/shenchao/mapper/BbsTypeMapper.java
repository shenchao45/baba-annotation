package com.shenchao.mapper;

import com.shenchao.entity.BbsType;
import com.shenchao.entity.BbsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsTypeMapper {
    int countByExample(BbsTypeExample example);

    int deleteByExample(BbsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsType record);

    int insertSelective(BbsType record);

    List<BbsType> selectByExample(BbsTypeExample example);

    BbsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsType record, @Param("example") BbsTypeExample example);

    int updateByExample(@Param("record") BbsType record, @Param("example") BbsTypeExample example);

    int updateByPrimaryKeySelective(BbsType record);

    int updateByPrimaryKey(BbsType record);
}