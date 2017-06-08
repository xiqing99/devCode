package org.qixi.employeeBasicInfo.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.qixi.dataDictionary.daoImpl.DepartmentDaoImpl;
import org.qixi.employeeBasicInfo.bo.EmployeeBasicInfoBo;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfoVo;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport
{
	private static final long serialVersionUID = 1L;
	
	final static Logger logger= Logger.getLogger(BaseAction.class);
	
	protected EmployeeBasicInfoBo basicInfoBo;
	
	protected EmployeeBasicInfoVo basicInfoVo;
	
	public void setEmployeeBasicInfoBo(EmployeeBasicInfoBo employeeBasicInfoBo)
	{
		this.basicInfoBo = employeeBasicInfoBo;
	}
	
	public void setBasicInfoVo(EmployeeBasicInfoVo employeeBasicInfoVo)
	{
		this.basicInfoVo = employeeBasicInfoVo;
	}
	
	public EmployeeBasicInfoVo getBasicInfoVo()
	{
		logger.debug("Get basicInfoVo");
		return basicInfoVo;
	}
	
	protected int getEmpIdFromSession()
	{
		Map sessionMap = ActionContext.getContext().getSession();
		
		return (int)sessionMap.get("employeeId");
	}
	
}