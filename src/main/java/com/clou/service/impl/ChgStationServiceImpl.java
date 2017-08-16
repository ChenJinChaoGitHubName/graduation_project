package com.clou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clou.dao.ChgStationMapper;
import com.clou.model.ChgStation;
import com.clou.service.ChgStationService;
@Service(value="chgStationService")
public class ChgStationServiceImpl implements ChgStationService{
	@Autowired
	private ChgStationMapper chgStationMapper;
	@Override
	public List<ChgStation> getStationName() {
		// TODO Auto-generated method stub
		List<ChgStation> chgStations=chgStationMapper.getStationName();
		return chgStations;
	}

}
