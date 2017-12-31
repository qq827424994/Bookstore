<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  
  <body>
    <center>
    	<jsp:include page="top.jsp"></jsp:include>
    	<div id="managePage">
    		<div id="manageLeft">
    			<jsp:include page="manageLeft.jsp"></jsp:include>
    		</div>
	    	<div id="manageBook">
		    	<s:action name="allBookAction" executeResult="false"></s:action>
	    		<ul class="manageBookUl">
	    			<li class="manageBookHead">
	    				<a class="more" href="oneType.jsp?searchType=bookStatus&searchDescribe=latest"></a>
	    			</li>
					<s:iterator value="#attr.latestBook" status="st">
						<li class="manageBookPicture">
							<a href="singleBook.jsp?bookId=<s:property value="bookId" />"><img src='../upload/<s:property value="bookPicture" />'/></a>
						</li>
						<li class="manageBookInfor">
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
</html>