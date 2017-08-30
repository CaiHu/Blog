package com.xiaohu.dao;

import java.util.List;

import com.xiaohu.entity.Users;

public interface UserDao {
	public List<Users> findUsers(Users user);
	public int insert(Users user);
	public int delete(int uid);
	public int update(Users user);
	public Users doCheck(Users user);
	public Users findById(int uid);

}
