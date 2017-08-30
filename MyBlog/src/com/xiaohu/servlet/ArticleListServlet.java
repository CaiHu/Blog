package com.xiaohu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohu.dao.ArticleDao;
import com.xiaohu.dao.impl.ArticleDaoImpl;
import com.xiaohu.entity.Article;
import com.xiaohu.entity.Users;

public class ArticleListServlet extends HttpServlet {
	private ArticleDao articleDao = new ArticleDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pageSize=5;
		int pageNum=1;
		int currentNum=0;
		String pageNumStr = request.getParameter("pageNum");
		if (pageNumStr!=null) {
			pageNum=Integer.parseInt(pageNumStr);
		}
		int preNum=pageNum;
		int nextNum=pageNum;
		int totalCount = articleDao.getTotalCount();
		request.setAttribute("pageNum", pageNum);
		if (pageNum>1) {
			preNum = pageNum-1;
		}
		
		
		Users user = (Users)request.getSession().getAttribute("user");
		
		int uid=0;
		if (user!=null) {
			uid = user.getUid();
		}
		List<Article> articleList = articleDao.findArtList(uid);
		currentNum = (pageNum-1)*pageSize+articleList.size();
		if (currentNum<totalCount) {
			nextNum = pageNum+1;
		}
		request.setAttribute("preNum",preNum );
		request.setAttribute("nextNum", nextNum);
		request.setAttribute("articleList", articleList);
		
		request.getRequestDispatcher("/articleManage/articleList.jsp").forward(request, response);

	}

}
