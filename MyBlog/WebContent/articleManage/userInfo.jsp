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
									�ҵ�����
								</div>
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								�ǳƣ�
							</td>
							<td>
								<input type="text" value="${user.unickName }" />
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								��ʵ������
							</td>
							<td>
								<input type="text" name="unickname" value="${user.utrueName }"/>
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								���룺
							</td>
							<td>
								<input type="text" name="upassword" value="${user.upassword }"/>
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								ȷ�����룺
							</td>
							<td>
								<input type="password" name="upwdtwice" />
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								�Ա�
							</td>
							<td>
								<input type="radio" name="usex" value="��" checked />
								��
								<input type="radio" name="usex" value="Ů" />
								Ů
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								�������ڣ�
							</td>
							<td>
								<fmt:formatDate var="bir" value="${user.ubirthday}"
									pattern="yyyy-MM-dd hh:mm:ss" />
								<input type="text" name="ubirthday" value="${bir}" />
							</td>

						</tr>
						<tr>
							<td class="tdAlignRight">
								��ߣ�
							</td>
							<td>
								<input type="text" name="uheight" />
							</td>
						</tr>
						<tr>
							<td class="tdAlignRight">
								���أ�
							</td>
							<td>
								<input type="text" name="uweight" />
							</td>
						</tr>
						<tr>
							<td>
								<input type="submit" name="sub" value="�ύ" />
							</td>
							<td>
								<input type="reset" name="reset" value="����" />
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
