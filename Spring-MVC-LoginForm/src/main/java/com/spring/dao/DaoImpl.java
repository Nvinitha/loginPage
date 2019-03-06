package com.spring.dao;

import com.spring.controller.LoginBean;

public class DaoImpl implements IDao {

	@Override
	public boolean validateLogin(LoginBean loginBean) {
		if (loginBean.getUserName().equals("chandra") && loginBean.getPassword().equals("chandra123"))
		{
			System.out.println("--------!!!!!!!!!!!!!!!!!!-------------");
			System.out.println("IN DAO IMPL");
			System.out.println("--------!!!!!!!!!!!!!!!!!!-------------");
			return true;
		}
		return false;
	}

}
