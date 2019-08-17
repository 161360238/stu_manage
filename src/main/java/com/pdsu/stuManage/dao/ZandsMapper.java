package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Zands;
import com.pdsu.stuManage.bean.ZandsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZandsMapper {
    long countByExample(ZandsExample example);

    int deleteByExample(ZandsExample example);

    int deleteByPrimaryKey(String reid);

    int insert(Zands record);

    int insertSelective(Zands record);

    List<Zands> selectByExample(ZandsExample example);

    Zands selectByPrimaryKey(String reid);

    int updateByExampleSelective(@Param("record") Zands record, @Param("example") ZandsExample example);

    int updateByExample(@Param("record") Zands record, @Param("example") ZandsExample example);

    int updateByPrimaryKeySelective(Zands record);

    int updateByPrimaryKey(Zands record);
}