package org.qixi.employeeBasicInfo.model;

import java.io.Serializable;

public class EmployeeBasicInfoVo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String extNum;
	private String mobileNum;
	private String email;
	private String qq;
	private String deptName;
	
	public EmployeeBasicInfoVo()
	{
		
	}	
	
	public EmployeeBasicInfoVo(int id, String name, String extNum, String mobileNum, String email, String qq, String deptName)
	{
		this.id = id;
		this.name = name;
		this.extNum = extNum;
		this.mobileNum = mobileNum;
		this.email = email;
		this.qq = qq;
		this.deptName = deptName;
	}
	
	public void init(EmployeeBasicInfo info, String deptName)
	{
		this.id = info.getId();
		this.name = info.getName();
		this.extNum = info.getExtNum();
		this.mobileNum = info.getMobileNum();
		this.email = info.getEmail();
		this.qq = info.getQq();
		this.deptName = deptName;
		
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setExtNum(String ext)
	{
		this.extNum = ext;
	}
	
	public String getExtNum()
	{
		return extNum;
	}
	
	public void setMobileNum(String mobileNum)
	{
		this.mobileNum = mobileNum;
	}
	
	public String getMobileNum()
	{
		return mobileNum;
	}
	
	public void setQq(String qq)
	{
		this.qq = qq;
	}
	
	public String getQq()
	{
		return qq;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}
	
	public String getDeptName()
	{
		return deptName;
	}
}