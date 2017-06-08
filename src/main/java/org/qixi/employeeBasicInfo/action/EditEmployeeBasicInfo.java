package org.qixi.employeeBasicInfo.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.qixi.dataDictionary.bo.DepartmentBo;



public class EditEmployeeBasicInfo extends BaseAction
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger logger= Logger.getLogger(EditEmployeeBasicInfo.class);
	
	private List <String> deptNameList;
	private DepartmentBo departmentBo;
	
	public String execute() throws Exception 
	{
		int employeeId = getEmpIdFromSession();
				
		basicInfoVo = basicInfoBo.getBasicInfoByEmpId(employeeId);
		logger.debug("basicInfoVo name = " +basicInfoVo.getName());
		
		deptNameList = departmentBo.getDeptNameList();
		
		return SUCCESS;
	}
	
	public void setDepartmentBo(DepartmentBo deptBo)
	{
		logger.debug("set departmentBo");
		this.departmentBo = deptBo;
	}
	
	public DepartmentBo getDepartmentBo()
	{
		return departmentBo;
	}
	
	public List<String> getDeptNameList()
	{
		return deptNameList;
	}
	
	public void setDeptNameList(List<String> nameList)
	{
		this.deptNameList = nameList;
	}
	
	public String getDefaultDeptName()
	{
		return basicInfoVo.getDeptName();
	}
}