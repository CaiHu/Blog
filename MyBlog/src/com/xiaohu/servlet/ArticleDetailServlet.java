package com.xiaohu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohu.dao.ArticleDao;
import com.xiaohu.dao.CommentDao;
import com.xiaohu.dao.impl.ArticleDaoImpl;
import com.xiaohu.dao.impl.CommentDaoImpl;
import com.xiaohu.entity.Article;
import com.xiaohu.entity.Comment;

public class ArticleDetailServlet extends HttpServlet {
	
	private ArticleDao articleDao = new ArticleDaoImpl();
	private CommentDao commentDao = new CommentDaoImpl();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String strArticleId = request.getParameter("aid");
		int articleId = Integer.parseInt(strArticleId);
		Article article = articleDao.findById(articleId);
//		int result = articleDao.update(article, false);
		article.setReadCount(article.getReadCount()+1);
		if (article!=null) {
			List<Comment> commentList = commentDao.findCommentList(articleId);
			request.setAttribute("article", article);
			request.setAttribute("commentList", commentList);
			request.setAttribute("aid", articleId);
			request.getRequestDispatcher("/articleManage/articleDetail.jsp").forward(request, response);
		}
		
	}

}
