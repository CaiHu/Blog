package com.xiaohu.servlet;

import java.io.IOException;

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
import com.xiaohu.util.StringDateParseUtil;

public class AddCommentServlet extends HttpServlet {
	
	//
	private CommentDao commentDao = new CommentDaoImpl();
	private ArticleDao articleDao = new ArticleDaoImpl();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Comment comment = new Comment();
		int articleId = Integer.parseInt((request.getParameter("aid")));
		comment.setArticleId(articleId);
		Article article = articleDao.findById(articleId);
		String commentAuthor = request.getParameter("commentAuthor");
		if (commentAuthor==null||commentAuthor.equals("")) {
			commentAuthor="ƒ‰√˚”√ªß";
		}
		comment.setCommentAuthor(commentAuthor);
		comment.setCommentContent(request.getParameter("content"));
		comment.setCommentSendTime(StringDateParseUtil.getDate(null));
		
		int result = commentDao.insert(comment,article,true);
		if (result!=0) {
			response.sendRedirect("/MyBlog/servlet/ArticleDetailServlet?aid="+articleId);
		}else{
			response.sendRedirect("/MyBlog/articleManage/error.jsp");
		}

	}

}
