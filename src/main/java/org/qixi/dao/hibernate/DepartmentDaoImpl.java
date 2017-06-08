package org.qixi.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.qixi.beans.Department;
import org.qixi.dao.DepartmentDao;

public class DepartmentDaoImpl extends GenericDAOImpl<Department, Integer> implements DepartmentDao
{

	@Override
	public List<Department> getDeptWithoutEmp()
	{
		Query query = getCurrentSession().createQuery("from Department d where d.empList is empty");
		return (List<Department>)query.list();
	}

}
