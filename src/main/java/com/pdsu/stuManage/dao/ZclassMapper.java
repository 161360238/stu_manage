package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Zclass;
import com.pdsu.stuManage.bean.ZclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZclassMapper {
    long countByExample(ZclassExample example);

    int deleteByExample(ZclassExample example);

    int deleteByPrimaryKey(String zcid);

    int insert(Zclass record);

    int insertSelective(Zclass record);

    List<Zclass> selectByExample(ZclassExample example);

    Zclass selectByPrimaryKey(String zcid);

    int updateByExampleSelective(@Param("record") Zclass record, @Param("example") ZclassExample example);

    int updateByExample(@Param("record") Zclass record, @Param("example") ZclassExample example);

    int updateByPrimaryKeySelective(Zclass record);

    int updateByPrimaryKey(Zclass record);
}