package com.pdsu.stuManage.dao;

import com.pdsu.stuManage.bean.Attendance;
import com.pdsu.stuManage.bean.AttendanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceMapper {
    long countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    int updateByExampleSelective(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByExample(@Param("record") Attendance record, @Param("example") AttendanceExample example);
}