package org.qixi.employeeBasicInfo.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeBasicInfoRowMapper implements RowMapper
{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeBasicInfo info = new EmployeeBasicInfo();
		
		info.setDeptId(rs.getInt("deptId"));
		info.setExtNum(rs.getString("extNum"));
		info.setId(rs.getInt("id"));
		info.setMobileNum(rs.getString("mobileNum"));
		info.setName(rs.getString("name"));
		info.setQq(rs.getString("qq"));
		info.setEmail(rs.getString("email"));
		
		return info;
	}
	 
}