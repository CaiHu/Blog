<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
</head>

<body>
<form action="<%=request.getContextPath() %>/servlet/LoginServlet" method="post" name="form1"> 
<input type="hidden" value="login" name="action"/>
<table width="100%">
  <tr>
    <td><table width="100%">
      <tr>
        <td>登录名：</td>
        <td><input type="text" name="unickname"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input type="password" name="upassword"/></td>
        <td>&nbsp;</td>
      </tr>
   
       <tr>
        <td></td>
        <td><input type="submit" name="sub" value="提交"/></td>
        <td><input type="reset" name="reset" value="重置"/></td>
      </tr>
    </table></td>
  </tr>
  
</table>
</form>
</body>
</html>
