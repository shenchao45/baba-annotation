package com.shenchao.mapper;

import com.shenchao.entity.BbsDetail;
import com.shenchao.entity.BbsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsDetailMapper {
    int countByExample(BbsDetailExample example);

    int deleteByExample(BbsDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsDetail record);

    int insertSelective(BbsDetail record);

    List<BbsDetail> selectByExample(BbsDetailExample example);

    BbsDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsDetail record, @Param("example") BbsDetailExample example);

    int updateByExample(@Param("record") BbsDetail record, @Param("example") BbsDetailExample example);

    int updateByPrimaryKeySelective(BbsDetail record);

    int updateByPrimaryKey(BbsDetail record);
}