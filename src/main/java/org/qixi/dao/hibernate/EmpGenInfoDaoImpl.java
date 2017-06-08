package org.qixi.dao.hibernate;

import java.util.List;


import org.hibernate.Query;
import org.qixi.beans.EmpGenInfo;
import org.qixi.dao.EmpGenInfoDao;

public class EmpGenInfoDaoImpl extends GenericDAOImpl<EmpGenInfo, Integer> implements EmpGenInfoDao
{

	@SuppressWarnings("unchecked")
	@Override
	public List<EmpGenInfo> getByName(
					String name)
	{		
		Query query = getCurrentSession().createQuery("from EmpGenInfo e where e.name = :name" );
		query.setString("name", name);
		
		return (List<EmpGenInfo>)query.list();
	}

	@Override
	public EmpGenInfo getByEmail(
					String email)
	{
		Query query = getCurrentSession().createQuery("from EmpGenInfo e where e.email = :email" );
		query.setString("email", email);
		
		return  (EmpGenInfo)query.uniqueResult();
	}

	@Override
	public List<String> getNameListByPos(
					Integer posId)
	{
		Query query = getCurrentSession().createQuery("select e.name from EmpGenInfo e where e.position.id = :posId")
						.setInteger("posId", posId);
		
		
		return (List<String>)query.list();
	}

	@Override
	public Long getNumOfEmpForDept(
					Integer deptId)
	{
		Query query = getCurrentSession().createQuery("select count(*) from EmpGenInfo e where e.dept.id = :deptId")
						.setInteger("deptId", deptId);
		
		return (Long)query.uniqueResult();
	}
	
	@Override
	public List<EmpGenInfo> getAll()
	{
		Query query = getCurrentSession().createQuery("from EmpGenInfo e left join fetch e.position left join fetch e.dept");
		return (List<EmpGenInfo>)query.list();
	}

}
