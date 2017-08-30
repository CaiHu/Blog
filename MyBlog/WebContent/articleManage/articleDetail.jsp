<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%@page import="com.lql.util.StringDateParseUtil"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>无标题文档</title>
	</head>

	<body>
		<table width="70%" align="center"
			style="text-align: center; table-layout: fixed; word-break: break-all">
			<tr>
				<td style="overflow: hidden; table-latyout: fixed; width: 100%">
					<div style="width: 100%"><%@include file="/top.jsp"%></div>
				</td>
			</tr>
			<tr>
				<td>
					<!-- 文章主体加评论列表 -->
					<table width="100%"
						style="margin-top: 10px; border-width: 1px; border-color: #D6D6D6; border-style: solid"
						align="center"
						style="text-align: left table-layout: fixed; word-break: break-all">
						<tr>
							<td>
								<table width="100%" align="left"
									class="commentsBorder">
									<tr>
										<td style="width: 100%" >
											${article.articleTitle }
										</td>
									</tr>
									<tr>
									<tr>
										<td style="width: 100%; text-indent: 2em;line-height:40px" align="left">
											<fmt:formatDate value="${article.articleSendTime }" 
												pattern="yyyy-MM-dd HH:mm:ss" /> 
											<span style="margin-left: 25px;">阅读(${article.readCount})</span><span
												style="margin-left: 25px;">评论(${article.commentCount})</span><span
												style="margin-left: 25px;"></span>
										</td>
									</tr>
									<tr>
										<td style="width: 100%; text-indent: 2em;line-height:25px" align="left">
											${article.articleContent }
										</td>
									</tr>
								</table>
							</td>
						</tr>


						<tr>
							<td>
								<!-- 评论列表 -->
								<div class="upHeader" style="margin-top:30px">评论信息</div>
								<c:forEach items="${commentList}" var="comment">

									<table width="100%" align="center" class="commentsBorder">
										<tr>
											<td style="width: 50%" align="left">
												${comment.commentAuthor }
											</td>
											<td style="width: 50%" align="right">
												<fmt:formatDate value="${comment.commentSendTime }"
													pattern="yyyy-MM-dd hh:mm:ss" />
											</td>
										</tr>
										<tr>
											<td colspan="2" align="left" style="width: 100%">
												${comment.commentContent }
											</td>
										</tr>
									</table>
								</c:forEach>
								<div><a href="/MyBlog/servlet/ArticleDetailServlet?aid=${article.articleId }&pageNum=1">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/MyBlog/servlet/ArticleDetailServlet?aid=${article.articleId }&pageNum=1">下一页</a></div>
							</td>
						</tr>

					</table>
				</td>
			</tr>
			<tr>
				<td align="left">
					<table width="100%" align="center"
						style="margin-top: 10px; border-width: 1px; border-color: #D6D6D6; border-style: solid">
						<tr>
							<td style="width: 100%" align="left">
								<jsp:include
									page="/articleManage/comment.jsp?aid=${article.articleId }"></jsp:include>
							</td>
						</tr>
					</table>

				</td>
			</tr>
		</table>
	</body>
</html>
