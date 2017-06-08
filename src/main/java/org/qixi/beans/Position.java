package org.qixi.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Position implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1092944707741877465L;
	
	private Integer id;
	private String name;
	private String description;
	
	public Position()
	{
		
	}
	
	public Position(Integer id, String name, String description)
	{
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	@Id
	@SequenceGenerator(name="idSeq", sequenceName="position_id_seq")
	@GeneratedValue(generator="idSeq")
	public Integer getId()
	{
		return id;
	}
	
	public void setId(Integer id)
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
	public String getDescription()
	{
		return description;
	}
	public void setDescription(
					String description)
	{
		this.description = description;
	}
	
	
}
