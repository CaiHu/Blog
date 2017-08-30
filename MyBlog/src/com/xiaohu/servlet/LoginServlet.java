package com.xiaohu.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohu.dao.ArticleDao;
import com.xiaohu.dao.UserDao;
import com.xiaohu.dao.impl.ArticleDaoImpl;
import com.xiaohu.dao.impl.UserDaoImpl;
import com.xiaohu.entity.Users;

public class LoginServlet extends HttpServlet {

	private UserDao userDao = new UserDaoImpl();
	private ArticleDao articleDao = new ArticleDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		String uname = request.getParameter("unickname");
		String upass = request.getParameter("upassword");
		Users user=new Users(uname,upass);
		Users curUser = userDao.doCheck(user);
		
		if (curUser!=null) {
			//更新最后登陆时间
//			userDao.update(curUser);
			request.getSession().setAttribute("user",curUser);
			response.sendRedirect("/MyBlog/servlet/IndexServlet");
		}else{
			response.sendRedirect("/MyBlog/articleManage/error.jsp");
		}
		
	}
	

}
