package com.shenchao.mapper;

import com.shenchao.entity.BbsTown;
import com.shenchao.entity.BbsTownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsTownMapper {
    int countByExample(BbsTownExample example);

    int deleteByExample(BbsTownExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsTown record);

    int insertSelective(BbsTown record);

    List<BbsTown> selectByExample(BbsTownExample example);

    BbsTown selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsTown record, @Param("example") BbsTownExample example);

    int updateByExample(@Param("record") BbsTown record, @Param("example") BbsTownExample example);

    int updateByPrimaryKeySelective(BbsTown record);

    int updateByPrimaryKey(BbsTown record);
}