package org.qixi.employeeBasicInfo.dao;

import java.util.List;

import org.qixi.employeeBasicInfo.model.EmployeeBasicInfo;

public interface EmployeeBasicInfoDao
{
	public EmployeeBasicInfo getById(int id);
	
	public List<EmployeeBasicInfo> getByName(String name);
	
	public int addNew(EmployeeBasicInfo info);
	
	public int unpdate(EmployeeBasicInfo info);
	
	public List<EmployeeBasicInfo> getAll();
	
	public int delById(int id);
	
}