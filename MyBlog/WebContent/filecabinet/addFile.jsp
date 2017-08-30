<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	function checkFileName(){
	
		var arr = document.getElementsByTagName("input");
		var flag = false;
		for(var i=0;i<arr.length;i++){
		if(arr[i].type=="file")
			if((arr[i].value)!=""&&(arr[i].value.indexOf("+"))==-1){
			
				flag = true;
			}
		}
		if(!flag)
		alert("至少选择一个文件上传，且文件名中不能包含'+'号 ");
		return flag;
		
	}
	</script>

  </head>
  
  <body>
  <table width="70%"  align="center"
			style="text-align: center; table-layout: fixed; word-break: break-all">
			<tr>
				<td style="overflow: hidden; table-latyout: fixed; width: 100%">
					<div style="width: 100%"><%@include file="/top.jsp"%></div>
				</td>
			</tr>
			<tr>
				<td width="75%">
				 <FORM METHOD="POST" ACTION="/MyBlog/servlet/FileUpServlet" ENCTYPE="multipart/form-data" onSubmit="return checkFileName()">
					<table width="95%" class="tableBorder1">
				
				<tr>
					<td>
						file1 : <INPUT TYPE="FILE" NAME="FILE1" SIZE="25"><BR>
					</td>
				</tr>
				<tr>
					<td>
						file2  : <INPUT TYPE="FILE" NAME="FILE2" SIZE="25"><BR>
						
					</td>
				</tr>
				<tr>
					<td>
						file3 : <INPUT TYPE="FILE" NAME="FILE3" SIZE="25"><BR>
  						
					</td>
				</tr>
				<tr>
					<td>
					 <INPUT TYPE="SUBMIT" VALUE="Upload">
						
  						
					</td>
				</tr>
				
			</table>
	
</FORM></td>
			</tr>
  	</table>
 

  </body>
</html>
