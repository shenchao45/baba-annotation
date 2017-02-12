package com.shenchao.mapper;

import com.shenchao.entity.BbsBuyer;
import com.shenchao.entity.BbsBuyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsBuyerMapper {
    int countByExample(BbsBuyerExample example);

    int deleteByExample(BbsBuyerExample example);

    int deleteByPrimaryKey(String username);

    int insert(BbsBuyer record);

    int insertSelective(BbsBuyer record);

    List<BbsBuyer> selectByExample(BbsBuyerExample example);

    BbsBuyer selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") BbsBuyer record, @Param("example") BbsBuyerExample example);

    int updateByExample(@Param("record") BbsBuyer record, @Param("example") BbsBuyerExample example);

    int updateByPrimaryKeySelective(BbsBuyer record);

    int updateByPrimaryKey(BbsBuyer record);
}