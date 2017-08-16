package com.clou.dao;

import java.util.List;
import java.util.Map;

import com.clou.model.Bill;

public interface BillMapper {
    int deleteByPrimaryKey(Integer billPayId);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer billPayId);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
    //非自动生成，自我编写,查询bill_pay表中的所有数据
    List<Map> getList();
    
    //根据创建时间和充电场站查询数据
    List<Map> getByTimeAndName(Map params);
    
    //根据创建时间查询数据
    List<Map> getByTime(String time);
    
    //根据充电场站查询数据
    List<Map> getByName(String stationName);
    
   
}