package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Iandf;
import com.pdsu.stuManage.bean.IandfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IandfMapper {
    long countByExample(IandfExample example);

    int deleteByExample(IandfExample example);

    int deleteByPrimaryKey(String reid);

    int insert(Iandf record);

    int insertSelective(Iandf record);

    List<Iandf> selectByExample(IandfExample example);

    Iandf selectByPrimaryKey(String reid);

    int updateByExampleSelective(@Param("record") Iandf record, @Param("example") IandfExample example);

    int updateByExample(@Param("record") Iandf record, @Param("example") IandfExample example);

    int updateByPrimaryKeySelective(Iandf record);

    int updateByPrimaryKey(Iandf record);
}