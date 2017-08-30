package com.xiaohu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lql.dao.impl.BaseDao;
import com.xiaohu.dao.ArticleDao;
import com.xiaohu.entity.Article;
import com.xiaohu.entity.Users;
import com.xiaohu.util.StringDateParseUtil;

public class ArticleDaoImpl extends BaseDao implements ArticleDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	BaseDao dbdao=new BaseDao();
	public int delete(int articleId) {
		//需要学生实现
		return 0;
	}
	//获得所有文章
	public List<Article> findArtList(int userid) {
		Article article=null;
		List<Article>list = new ArrayList<Article>();
		conn=dbdao.getConnection();
		String sql="select * from article where userid=?";
		try {
			conn=dbdao.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, userid);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				article=new Article(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7),rs.getInt(8));
				list.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//降序获得所有文章
	public List<Article> findArtListCount(int userid) {
		Article article=null;
		List<Article>list = new ArrayList<Article>();
		conn=dbdao.getConnection();
		String sql="select * from article where userid=? order by readcount desc";
		try {
			conn=dbdao.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, userid);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				article=new Article(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7),rs.getInt(8));
				list.add(article);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int getTotalCount() {
		int result =0;
		//需要学生实现
		return result;
	}
	//通过id找到文章内容
	public Article findById(int articleId) {
		Article article = null;
		String sql="select * from article where articleId = ?";
		
		conn=dbdao.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, articleId);
			rs=pstmt.executeQuery();
			while(rs.next()){
				article=new Article(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7),rs.getInt(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return article;
	}

	public int insert(Article article,Users user) {
		int result = 0;
		String sql="insert into article values(articleid_id.nextval,?,?,?,?,sysdate,?,?)";
		try {
			conn=dbdao.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, user.getUid());
			pstmt.setString(2, article.getArticleTitle());
			pstmt.setString(3, article.getArticleDigest());
			pstmt.setString(4, article.getArticleContent());
			pstmt.setInt(5, article.getReadCount());
			pstmt.setInt(6, article.getCommentCount());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(Article article,boolean flag) {
		int result = 0;
		//需要学生实现
		return result;
	}

}
