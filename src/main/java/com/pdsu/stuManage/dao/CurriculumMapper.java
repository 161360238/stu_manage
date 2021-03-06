package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Curriculum;
import com.pdsu.stuManage.bean.CurriculumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CurriculumMapper {
    long countByExample(CurriculumExample example);

    int deleteByExample(CurriculumExample example);

    int deleteByPrimaryKey(String cuid);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    List<Curriculum> selectByExample(CurriculumExample example);

    Curriculum selectByPrimaryKey(String cuid);

    int updateByExampleSelective(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByExample(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}