package com.clou.service;



import com.clou.model.Bill;
import com.clou.model.DataGrid;

public interface BillService {
public Bill getBillById(int id);
//获取bill_pay表的所有数据
public DataGrid getList(int page,int rows);
//根据时间和充电场站获取bill_pay表的数据
public DataGrid getByTimeAndName(String time,String stationName,int page,int rows);
//仅仅根据时间获取bill_pay表中的数据
public DataGrid getByTime(String time,int page,int rows);
//仅仅根据充电场站获取bill_pay表中的数据
public DataGrid getByName(String stationName,int page,int rows);
}
