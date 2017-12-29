<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
  <head>
	<link rel="stylesheet" type="text/css" href="css/style.css">
<style>

body{
	background-image: url(../image/body.jpg);
	background-repeat: no-repeat;
	background-size: 100% 100%;
}
</style>
  </head>

<body >
	<center>
		<div id="top">
			
			 
			<div id="welcome">
				<font style="color:green;font-weight: bold">
					 <s:property value="#session.managerLoginName"/>
				</font>
				您好！欢迎光临浙江工业大学奇点网上书店 <a href="../com.huizhi.action/userExitAction.action?userType=manager">安全退出</a>
			</div>
			<hr/>
		</div>
	</center>
</body>
