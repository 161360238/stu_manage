package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Punishment;
import com.pdsu.stuManage.bean.PunishmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PunishmentMapper {
    long countByExample(PunishmentExample example);

    int deleteByExample(PunishmentExample example);

    int deleteByPrimaryKey(String pid);

    int insert(Punishment record);

    int insertSelective(Punishment record);

    List<Punishment> selectByExample(PunishmentExample example);

    Punishment selectByPrimaryKey(String pid);

    int updateByExampleSelective(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    int updateByExample(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    int updateByPrimaryKeySelective(Punishment record);

    int updateByPrimaryKey(Punishment record);
}