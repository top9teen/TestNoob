package com.test.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.test.Bean.UserBean;
import com.test.util.ConnectDB;


@Repository
public class UserDao {

	
	public UserBean xxx(UserBean bean) throws SQLException {
		
		
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		
		try {
			
			sql.append(" SELECT * FROM  user WHERE username = ? AND password = ? ");
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1,bean.getUsername());
			prepared.setString(2,bean.getPassword());
			
			ResultSet rs = prepared.executeQuery();
			while (rs.next()) {
				bean.setUsername(rs.getString("username"));
				bean.setPassword(rs.getString("password"));
				bean.setStatus(rs.getString("status"));
				bean.setId(rs.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return bean;
	}
	
	
public void xxx2(UserBean bean) throws SQLException {
		
		
		ConnectDB con = new ConnectDB();
		PreparedStatement prepared = null;
		StringBuilder sql = new StringBuilder();
		Connection conn = con.openConnect();
		
		try {
			
			sql.append(" INSERT INTO user(username,password,status) VALUES(?,?,?) " );
			prepared = conn.prepareStatement(sql.toString());
			prepared.setString(1,bean.getUsername());
			prepared.setString(2,bean.getPassword());
			prepared.setString(3,bean.getStatus());
			prepared.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
