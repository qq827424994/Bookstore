<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<title>浙江工业大学奇点网上书店</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
<body>
	<center>
		<jsp:include page="top.jsp"></jsp:include>	
		<div id="managePage">
			<div id="manageLeft">
				<jsp:include page="manageLeft.jsp"></jsp:include>	
			</div>
			<div id="manageWelcome">
				<div style="font-weight: bold;font-size: 16px;">欢迎您：
					<font style="color: green;font-size: 24px;"><s:property value="#session.managerLoginName"/></font>
				</div>
		
			</div>
		</div>
			
	</center>
</body>
</html>
