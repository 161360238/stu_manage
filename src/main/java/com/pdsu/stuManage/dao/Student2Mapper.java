package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Student2;
import com.pdsu.stuManage.bean.Student2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Student2Mapper {
    long countByExample(Student2Example example);

    int deleteByExample(Student2Example example);

    int deleteByPrimaryKey(String sid);

    int insert(Student2 record);

    int insertSelective(Student2 record);

    List<Student2> selectByExample(Student2Example example);

    Student2 selectByPrimaryKey(String sid);

    int updateByExampleSelective(@Param("record") Student2 record, @Param("example") Student2Example example);

    int updateByExample(@Param("record") Student2 record, @Param("example") Student2Example example);

    int updateByPrimaryKeySelective(Student2 record);

    int updateByPrimaryKey(Student2 record);
}