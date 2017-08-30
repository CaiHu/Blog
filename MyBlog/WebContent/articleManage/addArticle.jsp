<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<link href="/MyBlog/images/style.css" rel="stylesheet" />
		<script type="text/javascript" src="/MyBlog/fckeditor/fckeditor.js"></script>
		<title>无标题文档</title>
		<script type="text/javascript">
		function getFck(){
		 var oFCKeditor = new FCKeditor('content') ;
		 oFCKeditor.BasePath = "/MyBlog/fckeditor/" ;
		 oFCKeditor.Height = 400;
		 oFCKeditor.ToolbarSet = "Default" ; 
		 oFCKeditor.Value="aaa";
		 oFCKeditor.ReplaceTextarea();
		 
		 }
		 
		function FCKeditor_OnComplete( editorInstance )
		{
			editorInstance.Events.AttachEvent( 'OnFocus', FCKeditor_OnFocus ) ;
		}
		
		function FCKeditor_OnFocus( editorInstance )
		{
			 var oEditor = FCKeditorAPI.GetInstance("content"); 
			//alert(oEditor.GetXHTML(true)); 
			oEditor.SetHTML("") ; 

		}
		 
</script>
	</head>

	<body onload="getFck()">
<c:if test="${sessionScope.user==null}">
	<jsp:forward page="/servlet/ArticleListServlet"></jsp:forward>
	</c:if>
	<table width="70%"   align="center"
			style="text-align: center; table-layout: fixed; word-break: break-all">
			<tr>
				<td style="overflow: hidden; table-latyout: fixed; width: 100%">
					<div style="width: 100%"><%@include file="/top.jsp"%></div>
				</td>
			</tr>
			<tr>
				<td width="75%">
		<form name="form1" action='/MyBlog/servlet/AddArticleServlet' method="post">
		
		<table width="100%" style=""><caption
					style="background-color: #F2F2F2; padding: 7px; text-align: left;font-size:20px;color:red;font-weight:bold"><br />写日志</caption>
					<tr><td align="left">标题：<input type="text" name="articleTitle"   size="40"></input>
						
					</td>
				</tr>
				<tr>
					<td>
						<textarea id="content" name="content"
							style="WIDTH: 100%; HEIGHT: 400px" onfocus="clearCont()">点击这里写日志内容</textarea>
						
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="SubM" value="发表" />
					</td>
				</tr>
			</table>
		</form>
		</td></tr></table>
	</body>
</html>
