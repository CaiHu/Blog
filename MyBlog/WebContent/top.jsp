<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<link href="/MyBlog/images/style.css" rel="stylesheet"/>

<div id="head" style="width:100%;background-color:red" >
<div style="background-color:#F1F1F1;width:100%" >
<img src="<%=request.getContextPath() %>/images/sinablogb.jpg" width="100%" height="220" />
</div>
<div id="nav" style="float:left">
<UL>
  <LI ><A   
  href="/MyBlog/servlet/IndexServlet">��ҳ</A> </LI>
  <LI><A   
  href="/MyBlog/servlet/ArticleListServlet">��־</A> </LI>
  <LI ><A   
  href="/MyBlog/servlet/PhotoServlet/">���</A> </LI>
  <LI><A   
  href="/MyBlog/servlet/ArticleListServlet/">����</A> </LI>
  <c:if test="${!empty(sessionScope.user)}">
  <LI ><A   
  href="/MyBlog/servlet/FileListServlet">�ļ���</A> </LI>
  
  <LI><A   
  href="#">����</A> </LI>
  <LI ><A   
  href="<%=request.getContextPath()%>/articleManage/userInfo.jsp">������Ϣ</A> </LI>
  </c:if>
  
  </UL>
</div>

