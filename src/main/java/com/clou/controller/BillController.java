package com.clou.controller;



import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clou.model.Bill;
import com.clou.model.DataGrid;
import com.clou.service.BillService;

@Controller
@RequestMapping("/bill")
public class BillController {
	@Resource(name="billService")
	private BillService billService;
	@RequestMapping("/showBill/{billId}")
	public String showBill(ModelMap modelMap,@PathVariable int billId){
		Bill bill=billService.getBillById(billId);
		modelMap.addAttribute("bill", bill);
		return "/showBill";
	}
	/*@RequestMapping("/showBills")
	public String showAllBill(ModelMap modelMap){
		List<Map> bills=billService.getList();
		modelMap.addAttribute("bills", bills);
		return "/showBills";	
	}
	*/
	@RequestMapping("/showBills")
	@ResponseBody
	public DataGrid showAllBill(@RequestParam("page")int page,@RequestParam("rows")int rows){
		DataGrid dataGrid=billService.getList(page,rows);
		return dataGrid;
		
	}
	//根据日期和充电场站查询bill_pay表中的数据
	@RequestMapping("/showBillsByTimeAndName")
	@ResponseBody
	public DataGrid showBillsByTimeAndName(@RequestParam("time")String time,@RequestParam("stationName")String stationName,@RequestParam("page")int page,@RequestParam("rows")int rows){
		DataGrid dataGrid=billService.getByTimeAndName(time, stationName, page, rows);
		return dataGrid;
	}
	//根据日期查询bill_pay表中的数据
	@RequestMapping("/showBillsByTime")
	@ResponseBody
	public DataGrid showBillsByTime(@RequestParam("time")String time,@RequestParam("page")int page,@RequestParam("rows")int rows){
		DataGrid dataGrid=billService.getByTime(time, page, rows);
		return dataGrid;
	}
	//根据充电场站查询bill_pay表中的数据
	@RequestMapping("/showBillsByName")
	@ResponseBody
	public DataGrid showBillsByName(@RequestParam("stationName")String stationName,@RequestParam("page")int page,@RequestParam("rows")int rows){
		DataGrid dataGrid=billService.getByName(stationName, page, rows);
		return dataGrid;
		
	}
}
