package com.shenchao.mapper;

import com.shenchao.entity.BbsCity;
import com.shenchao.entity.BbsCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsCityMapper {
    int countByExample(BbsCityExample example);

    int deleteByExample(BbsCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsCity record);

    int insertSelective(BbsCity record);

    List<BbsCity> selectByExample(BbsCityExample example);

    BbsCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsCity record, @Param("example") BbsCityExample example);

    int updateByExample(@Param("record") BbsCity record, @Param("example") BbsCityExample example);

    int updateByPrimaryKeySelective(BbsCity record);

    int updateByPrimaryKey(BbsCity record);
}