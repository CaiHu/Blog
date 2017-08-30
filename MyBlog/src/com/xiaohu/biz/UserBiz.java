package com.xiaohu.biz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiaohu.dao.UserDao;
import com.xiaohu.dao.impl.UserDaoImpl;
import com.xiaohu.entity.Users;
import com.xiaohu.util.StringDateParseUtil;

public class UserBiz {
	private UserDao userDao = new UserDaoImpl();
	public Users doCheck(Users user) {
		Users curUser = userDao.doCheck(user);
		return curUser;
	}

	public Users findById(int uid) {
		
		return null;
	}

	/**
	 * 查找评论数前5的人
	 */
	public List<Users> findUsers(Users user) {
		List<Users>list = userDao.findUsers(user);
		return list;
	}

	public int delete(int uid) {
		return 0;
	}

	public int insert(Users user) {
		int result = userDao.insert(user);
		return result;
	}

	public int update(Users user) {
		int result = userDao.update(user);
		return result;
	}


}
