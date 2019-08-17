package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Attendcode;
import com.pdsu.stuManage.bean.AttendcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendcodeMapper {
    long countByExample(AttendcodeExample example);

    int deleteByExample(AttendcodeExample example);

    int deleteByPrimaryKey(Integer acode);

    int insert(Attendcode record);

    int insertSelective(Attendcode record);

    List<Attendcode> selectByExample(AttendcodeExample example);

    Attendcode selectByPrimaryKey(Integer acode);

    int updateByExampleSelective(@Param("record") Attendcode record, @Param("example") AttendcodeExample example);

    int updateByExample(@Param("record") Attendcode record, @Param("example") AttendcodeExample example);

    int updateByPrimaryKeySelective(Attendcode record);

    int updateByPrimaryKey(Attendcode record);
}