package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Reward;
import com.pdsu.stuManage.bean.RewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardMapper {
    long countByExample(RewardExample example);

    int deleteByExample(RewardExample example);

    int deleteByPrimaryKey(String rid);

    int insert(Reward record);

    int insertSelective(Reward record);

    List<Reward> selectByExample(RewardExample example);

    Reward selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByExample(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByPrimaryKeySelective(Reward record);

    int updateByPrimaryKey(Reward record);
}