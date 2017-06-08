package org.qixi.security.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ManyToAny;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Resource implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1830533363472417267L;
	private int id;
	private String name;
	private String type;
	private String value;
	private Set<Role> roles = new HashSet<Role>();
	
	
	@ManyToMany(mappedBy="resources")
	public Set<Role> getRoles()
	{
		return roles;
	}
	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}
	@Id
	@SequenceGenerator(name="idSeq", sequenceName="res_id_seq")
	@GeneratedValue(generator="idSeq")
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getValue()
	{
		return value;
	}
	public void setValue(String value)
	{
		this.value = value;
	}
}
