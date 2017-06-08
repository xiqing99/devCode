package org.qixi.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Department implements Serializable
{
	private Integer id;
	private String name;
	private String desp;
	
	private Department supDept;
	private Set<Department> subDept = new HashSet<Department>();
	private List<EmpGenInfo> empList = new ArrayList<EmpGenInfo>();
	
	@OneToMany(mappedBy= "dept")
	public List<EmpGenInfo> getEmpList()
	{
		return empList;
	}

	public void setEmpList(
					List<EmpGenInfo> empList)
	{
		this.empList = empList;
	}

	public Department()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Department(String name)
	{
		this.name = name;		
	}
	
	@Id
	@SequenceGenerator(name="deptSeq", sequenceName="dept_id_seq", allocationSize=1)
	@GeneratedValue(generator="deptSeq")
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
	
	@ManyToOne()
	@JoinColumn(name="sup_id")
	public Department getSupDept()
	{
		return supDept;
	}
	public void setSupDept(
					Department supDept)
	{
		this.supDept = supDept;
	}
	
	@OneToMany(mappedBy="supDept", cascade= {CascadeType.ALL}, fetch= FetchType.LAZY)
	public Set<Department> getSubDept()
	{
		return subDept;
	}
	public void setSubDept(
					Set<Department> subDept)
	{
		this.subDept = subDept;
	}
	
}
