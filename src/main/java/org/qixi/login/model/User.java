package org.qixi.login.model;

import java.io.Serializable;

public class User implements Serializable
{
	private int employeeId;
	private String userName;
	private String password;
	private int role;	
	
	public User()
	{
		
	}
	
	public User(int employeeId, String userName, String password, int role)
	{
		this.employeeId = employeeId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setRole(int role)
	{
		this.role = role;
	}
	
	public int getRole()
	{
		return role;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}