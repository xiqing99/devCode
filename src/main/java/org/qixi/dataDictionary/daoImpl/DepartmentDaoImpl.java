package org.qixi.dataDictionary.daoImpl;


import java.util.List;

import org.apache.log4j.Logger;
import org.postgresql.util.PSQLException;
import org.qixi.dataDictionary.dao.DepartmentDao;
import org.qixi.dataDictionary.model.Department;
import org.qixi.dataDictionary.model.DepartmentRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class DepartmentDaoImpl extends JdbcDaoSupport implements DepartmentDao
{
	final static Logger logger= Logger.getLogger(DepartmentDaoImpl.class);

	@Override
	public int addNew(Department dept) 
	{
		String sql = "insert into department (name, supdeptid, description) values (?,?,?)";
		
		return getJdbcTemplate().update(sql, new Object[] {dept.getName(), dept.getSupDeptId(), dept.getDescription()});
	}

	@Override
	public void delByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department getById(int id) 
	{
		String sql = "select * from department where id =?";
		
		try {
			Department dept = (Department) getJdbcTemplate().queryForObject(sql, new Object[]{id}, new DepartmentRowMapper());

			logger.debug("The department name = " + dept.getName() + " ,id = " + id);
			return dept;
			
		} catch (EmptyResultDataAccessException e) {
			logger.warn(e);
			return null;
		}
	}

	@Override
	public Department getByName(String name) 
	{
		String sqlString = "select * from department where name =?";		
		
		try {
			
			Department dept = (Department)getJdbcTemplate().queryForObject(sqlString, new Object[]{name}, new DepartmentRowMapper());
			
			logger.debug("The department name = " + name + " ,id = " + dept.getId());			
			return dept;
			
		} catch (EmptyResultDataAccessException e) {

			logger.warn(e);
			return null;
		}		
	}

	@Override
	public List<Department> getAll() {
		
		return getJdbcTemplate().query("select * from department", new DepartmentRowMapper());
	}
	
	public List<String> getNameList()
	{
		return getJdbcTemplate().queryForList("select name from department", String.class);
	}
	
	public String getNameById(int id)
	{
		return getById(id).getName();
	}
	
	public int getIdByName(String name)
	{
		return getByName(name).getId();
	}
	

}