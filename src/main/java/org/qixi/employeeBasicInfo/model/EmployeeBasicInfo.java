package org.qixi.employeeBasicInfo.model;

public class EmployeeBasicInfo
{
	private int id;
	private String name;
	private String extNum;
	private String mobileNum;
	private String email;
	private String qq;
	private int deptId;
	
	public EmployeeBasicInfo()
	{
		
	}
	
	public EmployeeBasicInfo(int id, String name, String extNum, String mobileNum, String email, String qq, int deptId)
	{
		this.id = id;
		this.name = name;
		this.extNum = extNum;
		this.mobileNum = mobileNum;
		this.email = email;
		this.qq = qq;
		this.deptId = deptId;
	}
	
	public EmployeeBasicInfo(EmployeeBasicInfoVo infoVo, int deptId)
	{
		this.deptId = deptId;
		
		this.id = infoVo.getId();
		this.name = infoVo.getName();
		this.extNum = infoVo.getExtNum();
		this.mobileNum = infoVo.getMobileNum();
		this.email = infoVo.getEmail();
		this.qq = infoVo.getQq();
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
	
	public void setDeptId(int deptId)
	{
		this.deptId = deptId;
	}
	
	public int getDeptId()
	{
		return deptId;
	}
		
}