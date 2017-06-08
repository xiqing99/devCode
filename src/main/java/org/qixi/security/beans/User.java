package org.qixi.security.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.ManyToAny;
import org.qixi.beans.EmpGenInfo;

@Entity
@Table(name="user_login")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User implements Serializable
{
	private Integer id;
	private String name;
	private String password;
	private boolean enabled;
	private EmpGenInfo empGenInfo;
	private Set<Role>  roles = new HashSet<Role>();
	
	@ManyToMany
	@JoinTable(name="user_role",
		joinColumns= @JoinColumn(name="user_id"),
		inverseJoinColumns= @JoinColumn(name="role_id")
	)	
	public Set<Role> getRoles()
	{
		return roles;
	}
	
	public void setRoles(Set<Role> roles)
	{
		this.roles = roles;
	}
	
	@OneToOne
	@JoinColumn(name="emp_id", unique=true, nullable=false)	
	public EmpGenInfo getEmpGenInfo()
	{
		return empGenInfo;
	}
	public void setEmpGenInfo(
					EmpGenInfo empGenInfo)
	{
		this.empGenInfo = empGenInfo;
	}
	
	@Id
	@SequenceGenerator(name="idSeq", sequenceName="user_login_id_seq")
	@GeneratedValue(generator="idSeq")
	public Integer getId()
	{
		return id;
	}

	@Column(unique=true)
	public String getName()
	{
		return name;
	}
	public String getPassword()
	{
		return password;
	}
	public boolean isEnabled()
	{
		return enabled;
	}
	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}	

}
