package com.clou.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clou.model.ChgStation;
import com.clou.service.ChgStationService;

@Controller
@RequestMapping("/ChgStation")
public class ChgStationController {
	@Resource(name="chgStationService")
	private ChgStationService chgStationService;
	@RequestMapping("/getStationName")
	@ResponseBody
	public List<ChgStation> getStationName(){
		List<ChgStation> chgStations=chgStationService.getStationName();
		return chgStations;
		
	}
}
