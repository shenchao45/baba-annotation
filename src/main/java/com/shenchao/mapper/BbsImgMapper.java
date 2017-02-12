package com.shenchao.mapper;

import com.shenchao.entity.BbsImg;
import com.shenchao.entity.BbsImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsImgMapper {
    int countByExample(BbsImgExample example);

    int deleteByExample(BbsImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsImg record);

    int insertSelective(BbsImg record);

    List<BbsImg> selectByExample(BbsImgExample example);

    BbsImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsImg record, @Param("example") BbsImgExample example);

    int updateByExample(@Param("record") BbsImg record, @Param("example") BbsImgExample example);

    int updateByPrimaryKeySelective(BbsImg record);

    int updateByPrimaryKey(BbsImg record);
}