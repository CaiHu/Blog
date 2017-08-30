package com.xiaohu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.xiaohu.entity.Users;

public class FileDownServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		response.setContentType("text/html;charset=gbk");
		String temp_p = "";
		System.out.println(request.getMethod());
		if (request.getMethod().equals("GET")) {
			temp_p = new String(request.getParameter("downloadFileName").getBytes("iso8859-1"), "gbk");
			// if (temp_p.indexOf("@")!=-1) {
			// temp_p =temp_p.replace('@', '+');
			// }
		} else {
			temp_p = request.getParameter("downloadFileName");
		}
		String fileName = temp_p;//
		Users curUser = (Users) request.getSession().getAttribute("user");
		String unickName = curUser.getUnickName();
		response.setCharacterEncoding("text/html;charset=gbk");
		SmartUpload mySmartUpload = new SmartUpload();

		try {
			mySmartUpload.initialize(this.getServletConfig(), request, response);
			mySmartUpload.setContentDisposition(null);
			mySmartUpload.downloadFile("/userfiles/" + unickName + "/" + fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
