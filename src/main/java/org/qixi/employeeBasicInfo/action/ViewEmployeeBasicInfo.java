package org.qixi.employeeBasicInfo.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.qixi.employeeBasicInfo.bo.EmployeeBasicInfoBo;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfoVo;

import com.opensymphony.xwork2.ActionContext;

public class ViewEmployeeBasicInfo extends BaseAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	final static Logger logger= Logger.getLogger(ViewEmployeeBasicInfo.class);	

	@Override
	public String execute() throws Exception 
	{
		Map session = ActionContext.getContext().getSession();
		
		int employeeId = (int)session.get("employeeId");
		
		basicInfoVo = basicInfoBo.getBasicInfoByEmpId(employeeId);		

		return SUCCESS;
	}		
	
}