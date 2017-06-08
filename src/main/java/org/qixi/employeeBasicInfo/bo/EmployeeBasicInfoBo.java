package org.qixi.employeeBasicInfo.bo;

import org.apache.log4j.Logger;
import org.qixi.dataDictionary.dao.DepartmentDao;
import org.qixi.dataDictionary.daoImpl.DepartmentDaoImpl;
import org.qixi.employeeBasicInfo.dao.EmployeeBasicInfoDao;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfo;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfoVo;

public class EmployeeBasicInfoBo
{
	final static Logger logger= Logger.getLogger(DepartmentDaoImpl.class);
	
	EmployeeBasicInfoDao employeeBasicInfoDao;
	DepartmentDao departmentDao;
	
	public EmployeeBasicInfoBo() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeBasicInfoVo getBasicInfoByEmpId(int id)
	{
		EmployeeBasicInfo info = employeeBasicInfoDao.getById(id);
		
		if(info == null)
		{
			logger.warn("Can't find the employyee with id= " + id);
			return null;
		}		
		
		String deptNameString = departmentDao.getNameById(info.getDeptId());		
		
		EmployeeBasicInfoVo vo = new EmployeeBasicInfoVo();
		vo.init(info, deptNameString);
		
		return vo;
	}
	
	public void updateEmpBasicInfo(EmployeeBasicInfoVo infoVo)
	{
		int deptId = departmentDao.getIdByName(infoVo.getDeptName());		
		logger.debug("Dept id is "+ deptId);
		
		employeeBasicInfoDao.unpdate(new EmployeeBasicInfo(infoVo, deptId));		
		return ;
	}
	
	public void setEmployeeBasicInfoDao(EmployeeBasicInfoDao employeeBasicInfoDao)
	{
		this.employeeBasicInfoDao = employeeBasicInfoDao;
	}
	
	public void setDepartmentDao(DepartmentDao deptDao)
	{
		this.departmentDao = deptDao;
	}
}