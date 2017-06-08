package org.qixi.dataDictionary.dao;

import java.util.List;

import org.qixi.dataDictionary.model.Department;


public interface DepartmentDao
{
	public int addNew(Department dept);
	public void delByName(String name);
	public Department getById(int id);
	public Department getByName(String name);
	public String getNameById(int id);
	public int getIdByName(String name);
	public List<Department> getAll();
	public List<String> getNameList();
		
}