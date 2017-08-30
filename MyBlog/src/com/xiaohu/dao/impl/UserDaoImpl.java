package com.xiaohu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lql.dao.impl.BaseDao;
import com.xiaohu.dao.UserDao;
import com.xiaohu.entity.Users;
import com.xiaohu.util.StringDateParseUtil;

public class UserDaoImpl  extends BaseDao implements UserDao  {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	BaseDao dbdao=new BaseDao();
	
	//用户登录检测
	public Users doCheck(Users user) {
		Users curuser = null;
		String sql="select * from usersbiao where unickName=? and upassword=?";
		try {
			conn=dbdao.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUnickName());
			pstmt.setString(2, user.getUpassword());
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				curuser=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getDate(6),rs.getString(7),rs.getDate(8),rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getInt(12));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return curuser;
	}

	public Users findById(int uid) {
		//需要学生实现
		return null;
	}

	/**
	 * 查找文章发表数前五的人
	 */
	public List<Users> findUsers(Users user) {
		List<Users>list = new ArrayList<Users>();
		//需要学生实现
		return list;
	}

	public int delete(int uid) {
		
		return 0;
	}

	public int insert(Users user) {
		int result = 0;
		String sql = "insert into usersbiao values(userid_id.nextval,?,?,?,sysdate,sysdate,?,sysdate,?,?,?,?)";
		try {
			conn = dbdao.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUnickName());
			pstmt.setString(2, user.getUtrueName());
			pstmt.setString(3, user.getUpassword());
			pstmt.setString(4, user.getUsex());
			pstmt.setString(5, user.getUmarried());
			pstmt.setInt(6, user.getUheight());
			pstmt.setInt(7, user.getUweight());
			pstmt.setInt(8, user.getArticleCount());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	//更新最后登陆时间
	public int update(Users user) {
		int result = 0;
		String sql="update usersbiao set ulastlogintime=sysdate where userid=?";
		conn=dbdao.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, user.getUid());
			result=pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
