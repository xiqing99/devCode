package org.qixi.employeeBasicInfo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.qixi.employeeBasicInfo.dao.EmployeeBasicInfoDao;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfo;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfoRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.dao.EmptyResultDataAccessException;

public class EmployeeBasicInfoDaoImpl extends JdbcDaoSupport implements EmployeeBasicInfoDao
{
	final static Logger logger= Logger.getLogger(EmployeeBasicInfoDaoImpl.class);
	
	public EmployeeBasicInfo getById(int id)
	{
		String sql = "select * from emplBasicInfo where id =?";
		
		try
		{			
			EmployeeBasicInfo info = 
					(EmployeeBasicInfo) getJdbcTemplate().queryForObject(sql, new Object[] {id}, new EmployeeBasicInfoRowMapper());	
			
			logger.debug("Get employeeBasic info for id = " + id);
			return info;
		} catch (EmptyResultDataAccessException e) 
		{
			logger.warn("No result " + e);
			return null;
		}					
	}
	
	public int addNew(EmployeeBasicInfo info)
	{
		String sql = "INSERT INTO emplbasicinfo(name, extnum, mobilenum, email, qq, deptid) VALUES ( ?, ?, ?, ?, ?, ?)";
		
		return getJdbcTemplate().update(sql, 
				new Object[] {info.getName(), info.getExtNum(), info.getMobileNum(), info.getEmail(),info.getQq(), info.getDeptId()});
		
	}
	
	public int unpdate(EmployeeBasicInfo info)
	{
		String sql = "UPDATE emplbasicinfo SET name=?, extnum=?, mobilenum=?, email=?, qq=?, deptid=? WHERE id=?";
		
		return getJdbcTemplate().update(sql, 
				new Object[] {info.getName(), info.getExtNum(), info.getMobileNum(), info.getEmail(), info.getQq(), info.getDeptId(), info.getId()});						
	}
	
	public List<EmployeeBasicInfo> getAll()
	{
		return (List<EmployeeBasicInfo>) getJdbcTemplate().query("select * from emplBasicINfo", new EmployeeBasicInfoRowMapper());
	}

	@Override
	public List<EmployeeBasicInfo> getByName(String name) 
	{
		String sqlString = "select * from emplbasicinfo where name =?";
		
		return (List<EmployeeBasicInfo>)getJdbcTemplate().query(sqlString, new Object[]{name}, new EmployeeBasicInfoRowMapper());

	}

	@Override
	public int delById(int id) 
	{
		String sqlString = "delete from emplbasicInfo where id=?";
		
		return getJdbcTemplate().update(sqlString, new Object[]{id});
	}
}