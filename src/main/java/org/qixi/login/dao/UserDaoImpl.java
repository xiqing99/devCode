package org.qixi.login.dao;

import java.util.List;
import java.util.ArrayList;

import org.qixi.login.dao.UserDao;
import org.qixi.login.model.User;
import org.qixi.login.model.UserRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao
{
	public User findUserByNameAndPass(String userName, String password)
	{
		String sql = "select * from login where userName=? and password=?";
		
		User user = null;
		try {
			user = (User)getJdbcTemplate().queryForObject(sql, new Object[]{userName, password}, new UserRowMapper());
			
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

		return user;
	}
	
	public  List<User> findAll()
	{
		return (new ArrayList<User>());
	}
	
}