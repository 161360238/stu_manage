package com.pdsu.stuManage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MyStudent1Mapper {

    List<String> selectSidByClass(@Param("cid") String cid);
}
