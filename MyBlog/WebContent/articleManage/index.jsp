
<%@ page contentType="text/html; charset=gb2312" language="java"
	import="java.sql.*" errorPage=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
<script type="text/javascript">
	function goRegister() {
		location.href = "/MyBlog/articleManage/register.jsp";
	}
</script>
</head>

<body>
	<c:if test="${empty(articleList)}">
		<jsp:forward page="/servlet/IndexServlet"></jsp:forward>
	</c:if>
	<table width="70%" align="center"
		style="text-align: center; table-layout: fixed; word-break: break-all">
		<tr>
			<td style="overflow: hidden; table-latyout: fixed; width: 100%">
				<div style="width: 100%"><%@include file="/top.jsp"%></div>
			</td>
		</tr>
		<tr>
			<td width="75%">
				<table>
					<tr>
						<td style="width: 75%"><c:forEach items="${articleList}"
								var="article1">
								<table class="indexBorder"
									style="line-height: 30px; table-layout: fixed; word-break: break-all">
									<tr>
										<td>${article1.articleTitle }</td>
									</tr>
									<tr>
										<td style="text-indent: 2em";>${article1.articleDigest }...</td>
									</tr>
									<tr>
										<td><a
											href="/MyBlog/servlet/ArticleDetailServlet?aid=${article1.articleId}">阅读(${article1.readCount })</a><span
											style="margin-left: 25px;"><a
												href="/MyBlog/servlet/ArticleDetailServlet?aid=${article1.articleId}"
												style="text-decoration: none">评论(${article1.commentCount })</a></span><span
											style="margin-left: 25px;"><a
												href="/MyBlog/servlet/ArticleDetailServlet?aid=${article1.articleId}"
												style="text-decoration: none">阅读全文>> </a></span></td>
									</tr>
								</table>
							</c:forEach>
							<div style="text-align: right; line-height: 30px;">
								<a href="/MyBlog/servlet/ArticleListServlet?action=all">更多文章</a>
							</div></td>
						<td width="10"></td>
						<td valign="top"><c:if test="${!(empty(user))}">
								<div id="logined" style="margin-top: 50px">
									<table width="100%">
										<tr>
											<td><span class="bigMe"><a href="<%=request.getContextPath()%>/userDetail.jsp">关于我</a></span>
												<a href="/MyBlog/servlet/LoginServlet">退出</a></td>
										</tr>
										<tr>
											<td><img src="/MyBlog/images/header/1.jpg" width="40"
												height="40" /></td>
										</tr>
										<tr>
											<td>
												<%-- 最后登陆时间:<fmt:formatDate value="${user.ulastLoginTime}"pattern="yyyy-MM-dd HH:mm:ss" /> --%>
											</td>
										</tr>

										<tr>
											<td></td>
										</tr>

									</table>
								</div>
							</c:if> <c:if test="${(empty(user))}">
								<div id="notLogin" style="margin-top: 50px">
									<form
										action="<%=request.getContextPath()%>/servlet/LoginServlet"
										method="post" name="form1">
										<table>
											<tr>
												<td>用户名：</td>
												<td><input type="text" name="unickname"></td>
											</tr>
											<tr>
												<td>密码：</td>
												<td><input type="password" name="upassword"></td>
											</tr>
											<tr>
												<td><input type="submit" value="登陆"><input
													type="button" value="注册" onclick="goRegister()"></td>
											</tr>
										</table>
									</form>
								</div>
							</c:if>
							<div id="list">
								<table width="100%">
									<tr>
										<td class="bigMe">点击排行</td>
									</tr>
									<c:forEach items="${articleList2}" var="article1">
										<tr>
											<td style="text-indent: 2em"><a
												href="/MyBlog/servlet/ArticleDetailServlet?aid=${article1.articleId}">${article1.articleTitle }(${article1.readCount }/${article1.commentCount })</a>
											</td>
										</tr>
									</c:forEach>

									<tr>
										<td align="right"><a
											href="/MyBlog/servlet/ArticleListServlet?action=all"
											style="color: red">more</a></td>
									</tr>

								</table>
							</div></td>
					</tr>

				</table>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
	</table>
</body>
</html>
