package org.qixi.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T, ID extends Serializable>
{
	public T Get(ID id);
	
	public void save(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
	public List<T> getAll();
	
	public void deleteById(ID id);
}
