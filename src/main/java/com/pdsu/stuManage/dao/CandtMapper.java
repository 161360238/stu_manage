package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Candt;
import com.pdsu.stuManage.bean.CandtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandtMapper {
    long countByExample(CandtExample example);

    int deleteByExample(CandtExample example);

    int deleteByPrimaryKey(String csid);

    int insert(Candt record);

    int insertSelective(Candt record);

    List<Candt> selectByExample(CandtExample example);

    Candt selectByPrimaryKey(String csid);

    int updateByExampleSelective(@Param("record") Candt record, @Param("example") CandtExample example);

    int updateByExample(@Param("record") Candt record, @Param("example") CandtExample example);

    int updateByPrimaryKeySelective(Candt record);

    int updateByPrimaryKey(Candt record);
}