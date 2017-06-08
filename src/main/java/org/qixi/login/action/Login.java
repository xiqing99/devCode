package org.qixi.login.action;

import java.util.Map;

import org.qixi.login.bo.UserBo;
import org.qixi.login.model.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport
{
	String userName;
	String password;
	
	UserBo userBo;
	
	public String execute() throws Exception
	{
		User user = userBo.getUserByNameAndPass(userName, password);
		
		if(user != null)
		{
			Map session = ActionContext.getContext().getSession();
			
			session.put("userName", userName);
			session.put("employeeId", user.getEmployeeId());
			session.put("userRole", user.getRole());
			return ("Login_" + user.getRole());
			
		}
			
		
		addActionError(getText("invalidUser"));
		
		return "failure";
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
	
	public void setUserBo(UserBo userBo)
	{
		this.userBo = userBo;
	}
}