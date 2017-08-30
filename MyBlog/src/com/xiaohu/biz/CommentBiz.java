package com.xiaohu.biz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiaohu.entity.Comment;
import com.xiaohu.util.StringDateParseUtil;

public class CommentBiz {
	public int delete(int commentId) {
		return 0;
	}

	public Comment findById(int commentId) {
		return null;
	}

	public List<Comment> findCommentList(int articleId, int pageSize,
			int pageNum) {
		List<Comment>list = new ArrayList<Comment>();
		String sql = "select top 5 * from article where articleId=? order by article_sendTime  ";
		return list;
	}

	public int insert(Comment comment) {
		int result = 0;
		String sql = "insert into comment values(?,?,?,?)";
		return result;
	}

	public int update(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}
}
