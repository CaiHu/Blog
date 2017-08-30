package com.xiaohu.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.xiaohu.entity.Users;

public class FileListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String realPath = this.getServletContext().getRealPath("/")+"userfiles/";//获得根路径
		Users curUser = (Users) request.getSession().getAttribute("user");
		String unickName=curUser.getUnickName();
		//根据用户昵称存放，先查看该名字文件夹是否存在，不存在则先创建
		java.io.File dir = new java.io.File(realPath,unickName);
		List<File> list = new ArrayList<File>();
		File[] files = null;
		
		if(dir.isDirectory()){
			files = dir.listFiles();
		}
		if (files!=null&&files.length!=0) {
			
			list = Arrays.asList(files);
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("/filecabinet/showFileList.jsp").forward(request, response);
	}

}
