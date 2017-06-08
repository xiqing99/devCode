package org.qixi.login.dao;

import java.util.List;

import org.qixi.login.model.*;

public interface UserDao
{
	public User findUserByNameAndPass(String userName, String password);
	public List<User> findAll();
}