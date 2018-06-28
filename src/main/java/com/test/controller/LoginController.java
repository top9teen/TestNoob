package com.test.controller;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Bean.UserBean;
import com.test.Dao.UserDao;

@Controller
public class LoginController {
 
	@Autowired
	UserDao userDao ;
	
	
	@RequestMapping( value = "/")
	public String test() {
		
		return "index";
	}
	
	
	@RequestMapping(value ="/login")
	public String test2( String username ,String password ) throws SQLException {
		String page = "" ;
		UserBean bean = new UserBean();
		bean.setUsername(username);
		bean.setPassword(password);
		
		try {
			bean = userDao.xxx(bean);
			
			if(bean.getStatus().equals("1")) {
				page = "page1";
				
				
			}
			else {
				page = "page2";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  page;
	}
	
}
