<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>注册</title>
</head>

<body>
<table width="70%"   align="center"
			style="text-align: center; table-layout: fixed; word-break: break-all" cellpadding=0 cellspacing=0>
			<tr>
				<td style="overflow: hidden; table-latyout: fixed; width: 100%">
					<div style="width: 100%"><%@include file="/top.jsp"%></div>
				</td>
			</tr>
			<tr>
				<td width="75%">
<form action="<%=request.getContextPath() %>/servlet/RegisterServelet" method="post" name="form1"> 
<input type="hidden" value="register" name="action"/>
<table width="40%">
  <tr>
    <td><table width="100%">
      <tr>
        <td align="right">登录名：</td>
        <td align="left"><input type="text" name="unickname"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">真实姓名：</td>
        <td align="left"><input type="text" name="unickname"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">密码：</td>
        <td align="left"><input type="password" name="upassword" size="21"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">确认密码：</td>
        <td align="left"><input type="password" name="upwdtwice" size="21"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">性别：</td>
        <td align="left"><input type="radio" name="usex" value="男"checked/>男 <input type="radio" name="usex" value="女"/>女</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">出生日期：</td>
        <td align="left"><input type="text" name="ubirthday" /></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">身高：</td>
        <td align="left"><input type="text" name="uheight"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">体重：</td>
        <td align="left"><input type="text" name="uweight"/></td>
        <td>&nbsp;</td>
      </tr>
       <tr>
     
        <td align="right"><input type="submit" name="sub" value="提交"/></td>
        <td colspan="2" align="left"><input type="reset" name="reset" value="重置"/></td>
      </tr>
    </table></td>
  </tr>
  
</table>
</form>

</td>
</tr>
</table>
</body>
</html>

