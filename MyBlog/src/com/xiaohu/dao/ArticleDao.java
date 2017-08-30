package com.xiaohu.dao;

import java.util.List;

import com.xiaohu.entity.Article;
import com.xiaohu.entity.Users;

public interface ArticleDao {
	public List<Article> findArtList(int uid);
	public int insert(Article article,Users user);
	public int delete(int articleId);
	public int update(Article article,boolean falg);
	public Article findById(int articleId);
	public List<Article> findArtListCount(int uid) ;
	public int getTotalCount();

}
