<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
  <head>
	<link rel="stylesheet" type="text/css" href="css/styles.css">
  </head>
  
  <body>
    <center>
    	<jsp:include page="top.jsp"></jsp:include>
		<div id="managePage">
			<div id="left">
				<jsp:include page="manageLeft.jsp"></jsp:include>
			</div>
			<div id="oneType">
			<s:action name="oneTypeAction" executeResult="false"></s:action>
	    		<ul class="allBookUl">
	    			<li class="allBookHead">
	    				<s:property value="#request.typeDescribe"/>
	    			</li>
					<s:iterator value="#request.bookList" status="st">
						<li class="allBookPicture">
							<a href="singleBook.jsp?bookId=<s:property value="bookId" />"><img src='../upload/<s:property value="bookPicture" />'/></a>
						</li>
						<li class="allBookInfor">
							<a class="bookName" href="singleBook.jsp?bookId=<s:property value="bookId" />"><s:property value="bookName" /></a><br/><br/>
							作者：<a class="aboutBook" href="oneType.jsp?searchType=bookAuthor&searchDescribe=<s:property value="bookAuthor"/>"><s:property value="bookAuthor"/></a><br/><br/>
							出版社：<a class="aboutBook" href="oneType.jsp?searchType=bookPress&searchDescribe=<s:property value="bookPress"/>"><s:property value="bookPress"/></a><br/><br/>
							类别：<a class="aboutBook" href="oneType.jsp?searchType=bookType&searchDescribe=<s:property value="type.typeId"/>"><s:property value="type.typeName"/></a><br/><br/>
						</li>
					</s:iterator>
	    		</ul>
	    	</div>	
		</div>
		
    </center>
  </body>
