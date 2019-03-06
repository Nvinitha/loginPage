package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.controller.LoginBean;
import com.spring.dao.IDao;

@Service("service")
public class ServiceImpl implements IService 
{
	@Autowired
	IDao dao;

	@Override
	public boolean validateLogin(LoginBean loginBean) {
		
		return dao.validateLogin(loginBean);
	}

}
