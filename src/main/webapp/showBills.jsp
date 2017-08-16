<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->


<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/themes/icon.css">
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.net/Public/js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.net/Public/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
		function FindData() {
		//获取输入的日期
		var time=$("#time").datebox("getValue");
		//获取输入的充电场站名称
		var stationName=$("#cc").combobox("getText");
		//日期和场站名称都不为空
		if(time.replace(/(^\s*)|(\s*$)/g, "").length!=0&&stationName.replace(/(^\s*)|(\s*$)/g, "").length!=0){
		   $('#tt').datagrid({
				url : 'bill/showBillsByTimeAndName.action',
				queryParams:{
				"time":$("#time").datebox("getValue"),
				"stationName":$("#cc").combobox("getText")
				}
			});
		}
		//日期不为空，场站名称为空
		else if(time.replace(/(^\s*)|(\s*$)/g, "").length!=0&&stationName.replace(/(^\s*)|(\s*$)/g, "").length==0){		 
		$('#tt').datagrid({
				url : 'bill/showBillsByTime.action',
				queryParams:{
				"time":$("#time").datebox("getValue")
				}
			});		
		}
		//场站名称不为空，日期为空 
		else if(time.replace(/(^\s*)|(\s*$)/g, "").length==0&&stationName.replace(/(^\s*)|(\s*$)/g, "").length!=0){
		 $('#tt').datagrid({
				url : 'bill/showBillsByName.action',
				queryParams:{
				"stationName":$("#cc").combobox("getText")
				}
			});
		}
		else{
		alert("场站名称和日期不能都为空");
		}
		
		}
	</script>
</head>
  <body>
	<table id="tt" class="easyui-datagrid" style="width:100%;"
			url="bill/showBills.action"
			fit="false"
			toolbar="#searchtool"
			title="加载数据" iconCls="icon-save"
			rownumbers="true" pagination="true">
		<thead>
			<tr>
				<th field="billPayId" width="80">消费订单ID</th>
				<th field="billPayNo" width="160">消费订单编号</th>
				<th field="startTime" width="150" >开始充电时间</th>
				<th field="endTime" width="150" >结束充电时间</th>
				<th field="pileId" width="80">充电桩ID</th>
				<th field="innerId" width="80">枪内编号</th>
				<th field="startType" width="80">启动方式</th>
				<th field="preAmount" width="80">预消费金额</th>
				<th field="amount" width="80">消费金额 </th>
				<th field="chgPower" width="80">充电总量</th>
				<th field="elceFee" width="80">总电费</th>
				<th field="servFee" width="80">服务费</th>
				<th field="parkFee" width="80">停车费</th>
				<th field="createTime" width="150">创建时间</th>
				<th field="finishTime" width="150">订单完成时间</th>
				<th field="payState" width="80">订单状态</th>
				<th field="checkState" width="80">对账状态</th>
				<th field="billDesc" width="200">订单描述</th>
				<th field="orgId" width="80">运营商编号</th>
				<th field="consId" width="80">用户标识</th>
				<th field="isStop" width="80">是否已下发停止充电命令</th>
				<th field="settleTimes" width="80">后台尝试结算次数</th>
				<th field="payType" width="80">支付方式</th>
				<th field="prepayId" width="80">微信预支付会话标识</th>
				<th field="outBillNo" width="80">外部订单号</th>
				<th field="powerZxyg1" width="80">费率1电量</th>
				<th field="powerZxyg2" width="80">费率2电量</th>
				<th field="powerZxyg3" width="80">费率3电量</th>
				<th field="powerZxyg4" width="80">费率4电量</th>
				<th field="prcZxygz1" width="80">交易费率1电价</th>
				<th field="prcZxygz2" width="80">交易费率2电价</th>
				<th field="prcZxygz3" width="80">交易费率3电价</th>
				<th field="prcZxygz4" width="80">交易费率4电价</th>
				<th field="servPrice" width="80">服务费</th>
				<th field="carId" width="80">汽车ID</th>
				<th field="couponId" width="80">电子优惠券ID</th>
				<th field="minutes" width="80">分钟数</th>
				<th field="orderStatus" width="80">订单状态</th>
				<th field="discountFee" width="80">打折费用</th>
				<th field="fig" width="80">fig</th>
			</tr>
			
		</thead>
	</table>
	
	<div id="searchtool" style="padding:5px">  
        <span>日期:</span>
        <input type="text" id="time" class="easyui-datebox" required="required">
        <span>充电场站:</span> 
        <input id="cc" class="easyui-combobox" name="dept"
			data-options="valueField:'id',textField:'name',url:'ChgStation/getStationName.action'">
		<a href="javascript:FindData()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>  
    <div>  

</body>
</html>
