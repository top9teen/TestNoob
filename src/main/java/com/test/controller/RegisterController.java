package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Bean.UserBean;
import com.test.Dao.UserDao;

@Controller
public class RegisterController {
 
	@Autowired
	UserDao userDao;
	
	@RequestMapping( value = "/register")
	public String test() {
		
		return "register";
	}
	@RequestMapping(value ="/gotoregister")
	public String test2(String username ,String password ,String roleId) {
		UserBean bean = new UserBean();
		bean.setUsername(username);
		bean.setPassword(password);
		bean.setStatus(roleId);
		try {
			userDao.xxx2(bean);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return "index";
	}
}
