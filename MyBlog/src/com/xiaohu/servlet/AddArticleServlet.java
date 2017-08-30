package com.xiaohu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohu.dao.ArticleDao;
import com.xiaohu.dao.impl.ArticleDaoImpl;
import com.xiaohu.entity.Article;
import com.xiaohu.entity.Comment;
import com.xiaohu.entity.Users;
import com.xiaohu.util.StringDateParseUtil;

public class AddArticleServlet extends HttpServlet {
	private ArticleDao articleDao = new ArticleDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Users user = (Users) request.getSession().getAttribute("user");//当前用户
		String articleContent = request.getParameter("content");
		String articleDigest =""; 
		if (articleContent!=null && articleContent.length()>400) {
			articleDigest =articleContent.substring(0, 400);
		}
		articleDigest=articleContent;
		Article article = new Article();
		article.setUid(user.getUid());
		article.setArticleTitle(request.getParameter("articleTitle"));
		article.setArticleContent(articleContent);
		article.setArticleDigest(articleDigest);
		article.setArticleSendTime(StringDateParseUtil.getDate(null));
		article.setReadCount(0);
		article.setCommentCount(0);
		
		int result = articleDao.insert(article,user);
		if (result!=0) {
			response.sendRedirect("/MyBlog/servlet/ArticleListServlet");
		}else{
			response.sendRedirect("/MyBlog/articleManage/error.jsp");
		}
	}

}
