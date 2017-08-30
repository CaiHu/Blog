package com.xiaohu.biz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiaohu.dao.ArticleDao;
import com.xiaohu.dao.impl.ArticleDaoImpl;
import com.xiaohu.entity.Article;
import com.xiaohu.util.StringDateParseUtil;

public class ArticleBiz {
	private ArticleDao articleDao = new ArticleDaoImpl();
	public int delete(int articleId) {
		return 0;
	}

	public List<Article> findArtList(int userid, int pageSize, int pageNum) {
		List<Article>list =articleDao.findArtList(userid);
		return list;
	}

	public Article findById(int articleId) {
		Article article = articleDao.findById(articleId);
		
		return article;
	}

	public int insert(Article article) {
		int result = 0;
		String sql = "insert into article values(?,?,?,?,?,?,?)";
		
		return result;
	}

	public int update(Article article,boolean flag) {
		int result = 0;
		String sql="";
		return result;
	}
}
