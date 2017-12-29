<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>订单管理</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
<body>
	<center>
		<jsp:include page="top.jsp"></jsp:include>
		<div id="managePage">
			<div id="manageLeft">
				<jsp:include page="manageLeft.jsp"></jsp:include>
			</div>
			<div id="manageAllOrders">
				<ul class="singleOrders"  style="background-color: teal;">
					<li style="width: 700px;padding-top: 5px;padding-left: 10px;text-align: left;">
						<a class="aboutOrders" href="manageAllOrders.jsp?searchType=all">所有订单</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="aboutOrders" href="manageAllOrders.jsp?searchType=isDeal">已处理订单</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a class="aboutOrders" href="manageAllOrders.jsp?searchType=isNotDeal">未处理订单</a>
					</li>
				</ul>
				<ul class="singleOrders" style="background-color: yellow;">
					<li class="sequence">序列</li>			
					<li class="ordersNumber">订单编号</li>			
					<li class="ordersTime">订单日期</li>			
					<li class="ordersUser">订单用户</li>			
					<li class="dealOrders">处理订单</li>			
				</ul>
				<s:action name="allOrdersAction" executeResult="false"></s:action>
				<s:iterator value="#request.allOrders" status="st">
					<ul class="singleOrders">
						<li class="sequence"><s:property value="#st.getIndex()+#request.sequence+1"/></li>			
						<li class="ordersNumber">
							<a class="aboutBook" href="singleOrders.jsp?ordersId=<s:property value="ordersId"/>"><s:property value="ordersNumber"/></a>
						</li>			
						<li class="ordersTime"><s:date name="ordersTime" format="yyyy-MM-dd HH:mm:ss"/></li>			
						<li class="ordersUser">
							<a class="aboutBook" href="userInformation.jsp?userId=<s:property value="user.userId"/>"><s:property value="user.userName"/></a>
						</li>
						<li class="dealOrders">
							<s:if test='%{isDeal =="0"}'>
								<a class="aboutBook" href='../com.huizhi.action/dealOrdersAction.action?ordersId=<s:property value="ordersId"/>'>处理订单</a>
							</s:if>
							<s:else>
								----
							</s:else>
						</li>			
					</ul>
				</s:iterator>
			</div>
		</div>
		
	</center>
</body>
</html>
