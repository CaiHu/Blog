package com.xiaohu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohu.dao.ArticleDao;
import com.xiaohu.dao.impl.ArticleDaoImpl;
import com.xiaohu.entity.Article;
import com.xiaohu.entity.Users;

public class IndexServlet extends HttpServlet {
	private ArticleDao articleDao = new ArticleDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Users user = (Users)request.getSession().getAttribute("user");
		
		int uid=0;
		if (user!=null) {
			uid = user.getUid();
		}
		List<Article> articleList = articleDao.findArtList(uid);
		List<Article> articleList2 = articleDao.findArtListCount(uid);
		request.setAttribute("articleList", articleList);
		request.setAttribute("articleList2", articleList2);
		request.getRequestDispatcher("/articleManage/index.jsp").forward(request, response);

	}

}
