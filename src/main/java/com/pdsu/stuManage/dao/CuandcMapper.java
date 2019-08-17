package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Cuandc;
import com.pdsu.stuManage.bean.CuandcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CuandcMapper {
    long countByExample(CuandcExample example);

    int deleteByExample(CuandcExample example);

    int deleteByPrimaryKey(String reid);

    int insert(Cuandc record);

    int insertSelective(Cuandc record);

    List<Cuandc> selectByExample(CuandcExample example);

    Cuandc selectByPrimaryKey(String reid);

    int updateByExampleSelective(@Param("record") Cuandc record, @Param("example") CuandcExample example);

    int updateByExample(@Param("record") Cuandc record, @Param("example") CuandcExample example);

    int updateByPrimaryKeySelective(Cuandc record);

    int updateByPrimaryKey(Cuandc record);
}