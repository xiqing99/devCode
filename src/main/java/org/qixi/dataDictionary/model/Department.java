package org.qixi.dataDictionary.model;

public class Department
{
	private int id;
	private String name;
	private int supDeptId;
	private String description;
	
	public Department()
	{
		
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
	
	public void setSupDeptId(int supDeptId)
	{
		this.supDeptId = supDeptId;
	}
	
	public int getSupDeptId()
	{
		return supDeptId;
	}
	
	public void setDescription(String desc)
	{
		this.description = desc; 
	}
	
	public String getDescription()
	{
		return description;
	}
	
	
}