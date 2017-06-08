package org.qixi.employeeBasicInfo.action;

import org.apache.log4j.Logger;


public class UpdateEmployeeBasicInfo extends BaseAction
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger logger= Logger.getLogger(UpdateEmployeeBasicInfo.class);
	
	public String execute() throws Exception 
	{
		logger.debug("UpdateEmployeeBasicInfo action entered, the deptName is " + basicInfoVo.getDeptName());
		
	//	basicInfoVo.setDeptName(selectedDeptName);
		basicInfoBo.updateEmpBasicInfo(basicInfoVo);
				
		return SUCCESS;
	}
	
}