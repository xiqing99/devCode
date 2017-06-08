package org.qixi.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.qixi.dao.IGenericDao;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class GenericDAOImpl<T, ID extends Serializable> implements IGenericDao<T, ID>
{
	@Autowired
	private SessionFactory sessionFactory;
	protected Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public GenericDAOImpl()
	{
        this.entityClass = (Class<T>) ((ParameterizedType) getClass()
                        .getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public Class<T> getEntityClass()
	{
		return entityClass;
	}
	
	protected final Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public T Get(ID id)
	{		
		return (T) getCurrentSession().get(entityClass, id);
	}

	@Override
	public void save(T entity)
	{
		getCurrentSession().saveOrUpdate(entity);
		
	}

	@Override
	public void update(T entity)
	{
		getCurrentSession().update(entity);
		
	}

	@Override
	public void delete(T entity)
	{
		getCurrentSession().delete(entity);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll()
	{
		return getCurrentSession().createQuery("from " + entityClass.getName()).list();
	}

	@Override
	public void deleteById(ID id)
	{
		Query query = getCurrentSession().createQuery("delete from " + entityClass.getName() + " o where o.id = :id")
						.setParameter("id", id);
		query.executeUpdate();
	
	}

	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

	public void setSessionFactory(
					SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	

}
