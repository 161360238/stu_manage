package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Xandc;
import com.pdsu.stuManage.bean.XandcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XandcMapper {
    long countByExample(XandcExample example);

    int deleteByExample(XandcExample example);

    int deleteByPrimaryKey(String reid);

    int insert(Xandc record);

    int insertSelective(Xandc record);

    List<Xandc> selectByExample(XandcExample example);

    Xandc selectByPrimaryKey(String reid);

    int updateByExampleSelective(@Param("record") Xandc record, @Param("example") XandcExample example);

    int updateByExample(@Param("record") Xandc record, @Param("example") XandcExample example);

    int updateByPrimaryKeySelective(Xandc record);

    int updateByPrimaryKey(Xandc record);
}