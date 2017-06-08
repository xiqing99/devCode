package org.qixi.security.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Role implements Serializable
{
	private int id;
	private String name;
	private String disc;
	private Set<Resource> resources = new HashSet<Resource>();
	
	@ManyToMany
	@JoinTable(name="role_res",
					joinColumns= @JoinColumn(name="role_id"),
					inverseJoinColumns=@JoinColumn(name="res_id"))
	public Set<Resource> getResources()
	{
		return resources;
	}
	public void setResources(
					Set<Resource> resources)
	{
		this.resources = resources;
	}
	@Id
	@SequenceGenerator(name="idSeq", sequenceName="role_id_seq")
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
	public String getDisc()
	{
		return disc;
	}
	public void setDisc(String disc)
	{
		this.disc = disc;
	}
}
