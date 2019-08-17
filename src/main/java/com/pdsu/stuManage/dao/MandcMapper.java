package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Mandc;
import com.pdsu.stuManage.bean.MandcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MandcMapper {
    long countByExample(MandcExample example);

    int deleteByExample(MandcExample example);

    int deleteByPrimaryKey(Integer reid);

    int insert(Mandc record);

    int insertSelective(Mandc record);

    List<Mandc> selectByExample(MandcExample example);

    Mandc selectByPrimaryKey(Integer reid);

    int updateByExampleSelective(@Param("record") Mandc record, @Param("example") MandcExample example);

    int updateByExample(@Param("record") Mandc record, @Param("example") MandcExample example);

    int updateByPrimaryKeySelective(Mandc record);

    int updateByPrimaryKey(Mandc record);
}