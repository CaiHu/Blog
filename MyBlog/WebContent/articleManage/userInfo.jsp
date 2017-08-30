<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'userInfo.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

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
					<table width="70%" align="left">
						<tr>
							<td style="width: 75%" colspan="2">
								<div class="upHeader" style="margin-top: 30px">
									我的资料
								</div>
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								昵称：
							</td>
							<td>
								<input type="text" value="${user.unickName }" />
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								真实姓名：
							</td>
							<td>
								<input type="text" name="unickname" value="${user.utrueName }"/>
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								密码：
							</td>
							<td>
								<input type="text" name="upassword" value="${user.upassword }"/>
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								确认密码：
							</td>
							<td>
								<input type="password" name="upwdtwice" />
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								性别：
							</td>
							<td>
								<input type="radio" name="usex" value="男" checked />
								男
								<input type="radio" name="usex" value="女" />
								女
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								出生日期：
							</td>
							<td>
								<fmt:formatDate var="bir" value="${user.ubirthday}"
									pattern="yyyy-MM-dd hh:mm:ss" />
								<input type="text" name="ubirthday" value="${bir}" />
							</td>

						</tr>
						<tr>
							<td class="tdAlignRight">
								身高：
							</td>
							<td>
								<input type="text" name="uheight" />
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								体重：
							</td>
							<td>
								<input type="text" name="uweight" />
							</td>
						</tr>
						<tr>
							<td>
								<input type="submit" name="sub" value="提交" />
							</td>
							<td>
								<input type="reset" name="reset" value="重置" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
