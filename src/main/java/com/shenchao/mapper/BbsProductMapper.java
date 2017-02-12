package com.shenchao.mapper;

import com.shenchao.entity.BbsProduct;
import com.shenchao.entity.BbsProductExample;
import com.shenchao.entity.BbsProductWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BbsProductMapper {
    int countByExample(BbsProductExample example);

    int deleteByExample(BbsProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BbsProductWithBLOBs record);

    int insertSelective(BbsProductWithBLOBs record);

    List<BbsProductWithBLOBs> selectByExampleWithBLOBs(BbsProductExample example);

    List<BbsProduct> selectByExample(BbsProductExample example);

    BbsProductWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BbsProductWithBLOBs record, @Param("example") BbsProductExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsProductWithBLOBs record, @Param("example") BbsProductExample example);

    int updateByExample(@Param("record") BbsProduct record, @Param("example") BbsProductExample example);

    int updateByPrimaryKeySelective(BbsProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BbsProductWithBLOBs record);

    int updateByPrimaryKey(BbsProduct record);
}