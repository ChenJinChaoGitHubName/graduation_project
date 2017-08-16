package com.clou.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.clou.model.Bill;
import com.clou.model.DataGrid;
import com.clou.service.BillService;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring.xml",  
        "classpath:spring-mybatis.xml" }) 
public class BillServiceTest {
	private static final Logger LOGGER = Logger  
            .getLogger(BillServiceTest.class);
	@Resource(name="billService")  
    private BillService billService ;
	@Test
	public void testQueryById1(){
		Bill bill=billService.getBillById(1);
		LOGGER.info(JSON.toJSON(bill));
	}
	@Test
	public void testQueryAll(){
		DataGrid dataGrid=billService.getByTimeAndName("2016-08-26","科陆大厦充电站",1,5);
		LOGGER.info(JSON.toJSON(dataGrid));
	}
	@Test
	public void testByName(){
		DataGrid dataGrid=billService.getByName("科陆大厦充电站",1,10);
		LOGGER.info(JSON.toJSON(dataGrid));
	}
	@Test
	public void testByTime(){
		DataGrid dataGrid=billService.getByTime("2016-08-26", 1,10);
		LOGGER.info(JSON.toJSON(dataGrid));
	}
	
}
