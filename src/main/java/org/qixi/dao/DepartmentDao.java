package org.qixi.dao;

import java.util.List;

import org.qixi.beans.Department;

public interface DepartmentDao extends IGenericDao<Department, Integer>
{
	public List<Department> getDeptWithoutEmp();
}
