package org.qixi.login.bo;

import org.qixi.login.model.User;
import org.qixi.login.dao.UserDao;

public class UserBo
{
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	public boolean validate(String userName, String password)
	{		
		if(userDao.findUserByNameAndPass(userName, password) != null)
			return true;
		
		return false;
	}
	
	public User getUserByNameAndPass( String userName, String password)
	{
		return userDao.findUserByNameAndPass(userName, password);
	}

}