<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>用户登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<style type="text/css">
	body {
	background-image: url(image/u=3011213824,2822299511&fm=27&gp=0.jpg
	
	);
}
    </style>
	</head>
	<body >
		<center>
			<jsp:include page="top.jsp"></jsp:include>
			<div id="login">
				<h1>
					用户登录
				</h1>
				<br />
				<s:form action="loginAction">
					<s:textfield label="用户名" name="userName" ></s:textfield>
					<s:password label="密码" name="userPassword"></s:password>
					<s:submit value="登录"></s:submit>
				</s:form>
			</div>
			
		</center>
	</body>
</html>
