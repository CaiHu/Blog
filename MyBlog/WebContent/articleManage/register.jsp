<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>ע��</title>
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
        <td align="right">��¼����</td>
        <td align="left"><input type="text" name="unickname"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">��ʵ������</td>
        <td align="left"><input type="text" name="unickname"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">���룺</td>
        <td align="left"><input type="password" name="upassword" size="21"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">ȷ�����룺</td>
        <td align="left"><input type="password" name="upwdtwice" size="21"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">�Ա�</td>
        <td align="left"><input type="radio" name="usex" value="��"checked/>�� <input type="radio" name="usex" value="Ů"/>Ů</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">�������ڣ�</td>
        <td align="left"><input type="text" name="ubirthday" /></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">��ߣ�</td>
        <td align="left"><input type="text" name="uheight"/></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td align="right">���أ�</td>
        <td align="left"><input type="text" name="uweight"/></td>
        <td>&nbsp;</td>
      </tr>
       <tr>
     
        <td align="right"><input type="submit" name="sub" value="�ύ"/></td>
        <td colspan="2" align="left"><input type="reset" name="reset" value="����"/></td>
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

