<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>网上书店</title>
		<link rel="stylesheet" type="text/css" href="css/styles.css">

	</head>

	<body>
		<center>
			<jsp:include page="top.jsp"></jsp:include>
			<div id="firstPage">
				
				<div id="allBook">
					<jsp:include page="allBook.jsp"></jsp:include>
				</div>
			</div>
	
		</center>
	</body>
</html>