package com.xiaohu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohu.biz.UserBiz;
import com.xiaohu.dao.UserDao;
import com.xiaohu.dao.impl.UserDaoImpl;
import com.xiaohu.entity.Users;
import com.xiaohu.util.StringDateParseUtil;

public class RegisterServelet extends HttpServlet {
	private UserBiz userBiz;
	private UserDao userDao = new UserDaoImpl();

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		String unickName = request.getParameter("unickname");
		String utrueName = request.getParameter("utrueName");
		String upassword = request.getParameter("upassword");
		String usex = request.getParameter("usex");
		String ubirthday = request.getParameter("ubirthday");
		String uheight = request.getParameter("uheight");
		String uweight = request.getParameter("uweight");
		Users users = new Users();
		users.setUnickName(unickName);
		users.setUsex(usex);
		users.setUpassword(upassword);
		if (utrueName!=null) {
			users.setUtrueName(utrueName);
		}
		if (ubirthday!=null) {
			users.setUbirthday(StringDateParseUtil.getDate(ubirthday));
		}
		if (uheight!=null) {
			try {
				int height = Integer.parseInt(uheight);
				users.setUheight(height);
			} catch (Exception e) {
				users.setUheight(100);
			}
		}
		if (uweight!=null) {
			try {
				int weight = Integer.parseInt(uweight);
				users.setUweight(weight);
			} catch (Exception e) {
				users.setUweight(100);
			}
		}
		
		int result = userDao.insert(users);
		if (result!=0) {
			response.sendRedirect("/MyBlog/articleManage/index.jsp");
		}else{
			response.sendRedirect("/MyBlog/articleManage/error.jsp");
		}

	}

}
