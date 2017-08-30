package com.xiaohu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.xiaohu.entity.Users;
public class FileUpServlet extends HttpServlet {
	
//	private 

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String realPath = this.getServletContext().getRealPath("/");//获得根路径
		SmartUpload mySmartUpload = new SmartUpload();
		PrintWriter out = response.getWriter();
		Users curUser = (Users) request.getSession().getAttribute("user");
		String unickName=curUser.getUnickName();
		//根据用户昵称存放，先查看该名字文件夹是否存在，不存在则先创建
		String basePath2 =realPath+"userfiles/";//用户文件柜路径
		java.io.File dir = new java.io.File(basePath2,unickName);
		boolean flag=false;
		//不存在则先创建
		if (!dir.exists()) {
			try {
				flag = dir.mkdirs();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Variables
		int count=0;
		
		    request.setCharacterEncoding("gb2312"); 
		    
			// 初始化
			mySmartUpload.initialize(getServletConfig(), request, response);
	        //	 mySmartUpload.setAllowedFilesList("htm,html,txt,,");
			
			try {
				// 上传	
				mySmartUpload.upload();
				// 如果是多个文件
				for (int i=0;i<mySmartUpload.getFiles().getCount();i++){

					// 
					File myFile = mySmartUpload.getFiles().getFile(i);

					// 文件存在处理
					if (!myFile.isMissing()) {

						myFile.saveAs("/userfiles/"+unickName+"/" + myFile.getFileName());

//						out.println("FieldName = " + myFile.getFieldName() + "<BR>");
//						out.println("Size = " + myFile.getSize() + "<BR>");
//						String s =new String(myFile.getFileName().getBytes("ISO-8859-1"),"gbk");
//						out.println("FileName = " + myFile.getFileName()+ "<BR>");
//						out.println("FileExt = " + myFile.getFileExt() + "<BR>");
//						out.println("FilePathName = " + myFile.getFilePathName() + "<BR>");
//						out.println("ContentType = " + myFile.getContentType() + "<BR>");
//						out.println("ContentDisp = " + myFile.getContentDisp() + "<BR>");
//						out.println("TypeMIME = " + myFile.getTypeMIME() + "<BR>");
//						out.println("SubTypeMIME = " + myFile.getSubTypeMIME() + "<BR>");

						count ++;

					}

				}
			} catch (SmartUploadException e) {
				e.printStackTrace();
			}

			request.getRequestDispatcher("/servlet/FileListServlet").forward(request, response);
//		
//		out.println("<BR>" + mySmartUpload.getFiles().getCount() + " files could be uploaded.<BR>");
//
//		out.println(count + " file(s) uploaded.");
//		
//		
//		out.flush();
//		out.close();
	}

}
