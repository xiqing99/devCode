package org.qixi.dataDictionary.bo;

import java.util.List;

import org.qixi.dataDictionary.dao.DepartmentDao;

public class DepartmentBo
{
	private DepartmentDao deptDao;
	
	public List<String> getDeptNameList()
	{
		return deptDao.getNameList();
				
	}
	
	public void setDeptDao(DepartmentDao deptDao)
	{
		this.deptDao = deptDao;
	}
	
	public DepartmentDao getDeptDao()
	{
		return deptDao;
	}
}