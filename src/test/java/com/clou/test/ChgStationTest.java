package com.clou.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.clou.model.ChgStation;
import com.clou.service.BillService;
import com.clou.service.ChgStationService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" }) 
public class ChgStationTest {
	private static final Logger LOGGER = Logger  
            .getLogger(ChgStationTest.class);
	@Autowired  
    private ChgStationService chgStationService ;
	@Test
	public void testQueryChgStation(){
		List<ChgStation> chgStations=chgStationService.getStationName();
		LOGGER.info(JSON.toJSON(chgStations));
	}
}
