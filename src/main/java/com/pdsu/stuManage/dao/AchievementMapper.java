package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Achievement;
import com.pdsu.stuManage.bean.AchievementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AchievementMapper {
    long countByExample(AchievementExample example);

    int deleteByExample(AchievementExample example);

    int deleteByPrimaryKey(String rid);

    int insert(Achievement record);

    int insertSelective(Achievement record);

    List<Achievement> selectByExample(AchievementExample example);

    Achievement selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") Achievement record, @Param("example") AchievementExample example);

    int updateByExample(@Param("record") Achievement record, @Param("example") AchievementExample example);

    int updateByPrimaryKeySelective(Achievement record);

    int updateByPrimaryKey(Achievement record);
}