package com.xiaohu.dao;

import java.util.List;

import com.xiaohu.entity.Article;
import com.xiaohu.entity.Comment;

public interface CommentDao {
	public List<Comment> findCommentList(int articleId);
	public int insert(Comment comment,Article article,boolean flag);
	public int delete(int commentId);
	public int update(Comment comment);
	public Comment findById(int commentId);
	
}
