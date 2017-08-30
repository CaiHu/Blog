package com.xiaohu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lql.dao.impl.BaseDao;
import com.xiaohu.dao.CommentDao;
import com.xiaohu.entity.Article;
import com.xiaohu.entity.Comment;
import com.xiaohu.util.StringDateParseUtil;

public class CommentDaoImpl extends BaseDao implements CommentDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	BaseDao dbdao=new BaseDao();
	
	public int delete(int commentId) {
		//需要学生实现
		return 0;
	}

	public Comment findById(int commentId) {
		//需要学生实现
		return null;
	}

	public List<Comment> findCommentList(int articleId) {
		List<Comment>list = new ArrayList<Comment>();
		String sql="select * from comments where articleid=?";
		try {
			conn=dbdao.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, articleId);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Comment com=new Comment(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getDate(5));
				list.add(com);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int insert(Comment comment,Article article,boolean flag) {
		int result = 0;
		String sql="insert into comments values(commentid_id.nextval,?,?,?,sysdate)";
		try {
			conn=dbdao.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, article.getArticleId());
			pstmt.setString(2,comment.getCommentAuthor());
			pstmt.setString(3, comment.getCommentContent());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(Comment comment) {
		//需要学生实现
		return 0;
	}

}
