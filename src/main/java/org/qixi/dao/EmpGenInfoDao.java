package org.qixi.dao;

import java.util.List;

import org.qixi.beans.EmpGenInfo;

public interface EmpGenInfoDao extends IGenericDao<EmpGenInfo, Integer>
{
	public List<EmpGenInfo> getByName(String name);
	public EmpGenInfo getByEmail(String email);
	public List<String> getNameListByPos(Integer posId);
	public Long getNumOfEmpForDept(Integer deptId);
}
