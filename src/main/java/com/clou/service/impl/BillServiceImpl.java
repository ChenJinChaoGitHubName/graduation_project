package com.clou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clou.dao.BillMapper;
import com.clou.model.Bill;
import com.clou.model.DataGrid;
import com.clou.service.BillService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service("billService")
public class BillServiceImpl implements BillService{
	@Autowired
	private BillMapper billMapper;
	@Override
	public Bill getBillById(int id) {
		// TODO Auto-generated method stub
		return billMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public DataGrid getList(int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,rows);
		List<Map> bills=billMapper.getList();
		DataGrid data=new DataGrid();
		data.setRows(bills);
		PageInfo<Map> pageInfo=new PageInfo<>(bills);
		data.setTotal(pageInfo.getTotal());
		return data;
	}

	@Override
	public DataGrid getByTimeAndName(String time, String stationName, int page,
			int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,rows);
		Map<String,String> params=new HashMap<String, String>();
		params.put("time",time );
		params.put("stationName",stationName);
		List<Map> bills=billMapper.getByTimeAndName(params);
		DataGrid data=new DataGrid();
		data.setRows(bills);
		PageInfo<Map> pageInfo=new PageInfo<>(bills);
		data.setTotal(pageInfo.getTotal());
		return data;
	}

	@Override
	public DataGrid getByTime(String time, int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,rows);
		List<Map> bills=billMapper.getByTime(time);
		DataGrid data=new DataGrid();
		data.setRows(bills);
		PageInfo<Map> pageInfo=new PageInfo<>(bills);
		data.setTotal(pageInfo.getTotal());
		return data;
	}

	@Override
	public DataGrid getByName(String stationName, int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page,rows);
		List<Map> bills=billMapper.getByName(stationName);
		DataGrid data=new DataGrid();
		data.setRows(bills);
		PageInfo<Map> pageInfo=new PageInfo<>(bills);
		data.setTotal(pageInfo.getTotal());
		return data;
	}

}
