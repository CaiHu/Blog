<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
</head>

<body>
<c:if test="${requestScope.articleList==null}">
			<jsp:forward page="/servlet/ArticleListServlet"></jsp:forward>
		</c:if>
		<c:if test="${fn:length(articleList)==0}">
	
	</c:if>
	<table width="70%" align="center"style="text-align: center; table-layout: fixed; word-break: break-all;" cellspacing=0 cellpadding=0>
			<tr>
				<td style="overflow: hidden; table-latyout: fixed; width: 100%">
					<div style="width: 100%"><%@include file="/top.jsp"%></div>
				</td>
			</tr>
			<tr>
				<td width="75%">
				<table width="100%" style="margin-top:0px;">
				<tr>
				<td align="left" style="margin-top:0px;"><a href="/MyBlog/articleManage/addArticle.jsp"class="writeArticle">写日志</a></td>
				</tr>
		 <c:forEach items="${articleList}" var="article">
				<tr >
					<td align="left" class="tdBorder" width="75%"><div style="float:left">
					<a href="/MyBlog/servlet/ArticleDetailServlet?aid=${article.articleId}" >${article.articleTitle }</a>
					</div>
					<div style="float:right;display:inline;margin-right:50px"><c:if test="${!empty(user)&&(user.uid==article.uid)}">
					<a   class="downFont" href="javascript:test1('${article.articleId}')">修改</a>
					<a   class="downFont" href="javascript:test1('${article.articleId}')">删除</a>
					</c:if>(${article.readCount }/${article.commentCount })&nbsp;&nbsp;
					
					</div>
					
					</td>
					
				</tr>
				
		</c:forEach>
		 <tr><td>
		<a href="/MyBlog/servlet/ArticleListServlet?pageNum=${preNum }">上一页</a><a href="/MyBlog/servlet/ArticleListServlet?pageNum=${nextNum }">下一页</a>
		</td></tr>
		</table>
	</td></tr>
	</table>

</body>
</html>
