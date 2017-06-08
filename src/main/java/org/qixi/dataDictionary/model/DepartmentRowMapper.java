package org.qixi.dataDictionary.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DepartmentRowMapper implements RowMapper
{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		Department department = new Department();
		
		department.setId(rs.getInt("id"));
		department.setName(rs.getString("name"));
		department.setSupDeptId(rs.getInt("supDeptId"));
		department.setDescription(rs.getString("description"));
		
		return department;
	}
	
}