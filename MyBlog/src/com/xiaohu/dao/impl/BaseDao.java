package com.xiaohu.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private final static String pwd ="um";//����
	private final static String username ="um";//�û���
	private final static String drivername ="oracle.jdbc.driver.OracleDriver";//����
	private final static String URL ="jdbc:oracle:thin:@localhost:1521:orcl";//url
	
	//��ȡ����
	public Connection getConnection(){
		//���Ӷ���
		Connection conn =null;
		
		try {
			//��������
			Class.forName(drivername);
			//��ȡ����
			conn = DriverManager.getConnection(URL,username,pwd);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//�ͷ���Դ
	public void closeAll(Connection conn,Statement stmt,ResultSet rs){
		//
		if (rs!=null) {
			
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		//
		if (stmt!=null) {
			
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		//
		if (conn!=null) {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	

}