<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
<style>

body{
	background-image: url(image/body.jpg);
	background-repeat: no-repeat;
	background-size: 100% 100%;
}
</style>
  </head>

<body>
	<center>
		<div id="top">
			
			 <div id="searchBook">
				<a href="firstPage.jsp" style="text-align:center;float:none;font-size:15px;">首页</a><br>
				<s:if test="%{#session.loginUser == null}">
					<font style="color:red;font-weight: bold">游客</font>
					您好！欢迎光临网上书店 <a href="enroll.jsp">注册</a> <a href="login.jsp">登录</a>  <a href="managerLogin.jsp">管理员</a><br>
				</s:if>
				<s:else>
					<font style="color:green;font-weight: bold">
						 <s:property value="#session.loginUser.userName"/>
					</font>
					您好！欢迎光临网上书店
					<a href="personalInformation.jsp">个人信息</a> <a href="shoppingCart.jsp">我的购物车</a> <a href="allOrders.jsp">我的订单</a> <a href="com.huizhi.action/userExitAction.action?userType=ordinaryUser">安全退出</a><br>
				</s:else>
					&nbsp;&nbsp;&nbsp;&nbsp;按
					<input type="radio" name="searchType" value="bookName" checked="checked"/>名称
					<input type="radio" name="searchType" value="bookAuthor"/>作者
					<input type="radio" name="searchType" value="bookPress"/>出版社
					<input type="radio" name="searchType" value="bookType"/>图书类别
					<input type="text" name="searchDescribe" id="searchDescribeID" />
					<input type="button" value="搜索图书" onclick="searchBook()"/>
			</div>
			<hr/>
		</div>
	</center>
</body>
<SCRIPT type="text/javascript">
	function searchBook(){
		var searchType = "";
		for (i;i<document.all.searchType.length;i++){
		    if (document.all.searchType[i].checked){
		    	searchType = document.all.searchType[i].value;
		    }
	    }
		var searchDescribe = document.getElementById("searchDescribeID").value;
		location.href="oneType.jsp?searchType="+searchType+"&searchDescribe="+searchDescribe;
	}
 
</SCRIPT>
</html>