package org.qixi.login.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException	
	{
		User user = new User();
		
		user.setEmployeeId(rs.getInt("employeeid"));
		user.setUserName(rs.getString("username"));
		user.setPassword(rs.getString("password"));
	    user.setRole(rs.getInt("role"));	
	    
	    return user;
	}
}