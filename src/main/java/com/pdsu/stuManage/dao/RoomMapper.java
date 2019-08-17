package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Room;
import com.pdsu.stuManage.bean.RoomExample;
import com.pdsu.stuManage.bean.RoomKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(RoomKey key);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(RoomKey key);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}