<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
	<head>

		<title>My JSP 'showFileList.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="/MyBlog/images/style.css" rel="stylesheet"/>
	<script type="text/javascript">
	
		function show(id){
			var cid=id+1;
			var obj = document.getElementById("td"+cid);
			obj.style.display="block";
		}
		function test1(fileName)
		{
		
		//var name="";
			//url =encodeURIComponent("/MyBlog/servlet/FileDownServlet?downloadFileName="+fileName);
			//var i = fileName.indexOf("+");
			//if(i!=-1){
			//alert();
			//name = fileName.replace("+","@");
			//}
			url ="/MyBlog/servlet/FileDownServlet?downloadFileName="+fileName;
			
			location.href=url;
			
		}
	
	</script>
	</head>

	<body>
		<c:if test="${requestScope.list==null}">
			<jsp:forward page="/servlet/FileListServlet"></jsp:forward>
		</c:if>
		
	<table width="70%" align="center" style="text-align: center; table-layout: fixed; word-break: break-all">
			<tr>
				<td style="overflow: hidden; table-latyout: fixed; width: 100%">
					<div style="width: 100%"><%@include file="/top.jsp"%></div>
				</td>
			</tr>
			<tr>
				<td width="75%">
				<div class="upHeader">文件列表
				<table width="100%"  class="tableBorder2">
				<tr>
				<td class="tdBorder">
				
				<c:if test="${(fn:length(requestScope.list))==0}">
					该文件柜中还没有文件
				</c:if>

				</td>
				</tr>
				
		 <c:forEach items="${list}" var="file">
				<tr >
					<td  class="tdBorder" >
					
					<span>${file.name }</span><a   class="downFont" href="javascript:test1('${file.name}')">下载</a>
					</td>
				</tr>
		</c:forEach>
		</table>
	</div>
	</td></tr>
	<tr><td>
	<div class="upHeader" style="margin-top:30px">上传文件
		<FORM METHOD="POST" ACTION="/MyBlog/servlet/FileUpServlet" ENCTYPE="multipart/form-data" onSubmit="return checkFileName()">
					<table width="95%" style="magrin-top:0px;padding-top:0px" >
				<tr>
					<td>
						 <INPUT TYPE="FILE" NAME="FILE1" SIZE="25"> <a href="javascript:show(1)">继续添加文件</a><BR>
					</td>
				</tr>
				<tr>
					<td style="display:none" id="td2">
						<INPUT TYPE="FILE" NAME="FILE2" SIZE="25"> <a href="javascript:show(2)">继续添加文件</a><BR>
						
					</td>
				</tr>
				<tr>
					<td style="display:none" id="td3">
						<INPUT TYPE="FILE" NAME="FILE3" SIZE="25"> <a href="javascript:show(3)">继续添加文件</a><BR>
  						
					</td>
				</tr>
				<tr>
					<td style="display:none" id="td4"><INPUT TYPE="FILE" NAME="FILE4" SIZE="25"> <BR>
  						
					<br><br></td>
				</tr>
				<tr>
					<td >
					 <INPUT TYPE="SUBMIT" VALUE="Upload">
						
  						
					</td>
				</tr>
				
			</table>
	
</FORM>

</div>
	</td></tr>
	</table>
	</body>
</html>
