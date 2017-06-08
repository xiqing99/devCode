package org.qixi.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="emp_gen_info")
public class EmpGenInfo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer empId;
	private String name;
	private String extNum;
	private String mobileNum;
	private String email;
	private String qq;
	private String other;	
	private Position position;
	private Department dept;
	
//	@OneToOne(mappedBy="empGenInfo")
	
//	@OneToMany
//  @JoinColumn(name="xxId")

	@ManyToOne()
	@JoinColumn(name="dept_id")
	public Department getDept()
	{
		return dept;
	}

	public void setDept(Department dept)
	{
		this.dept = dept;
	}

	public EmpGenInfo()
	{
		
	}
	
	@Id
	@SequenceGenerator(name="idSeq", sequenceName="emp_gen_info_id_seq")
	@GeneratedValue(generator="idSeq")
	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getEmpId()
	{
		return empId;
	}

	public void setEmpId(Integer empId)
	{
		this.empId = empId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getExtNum()
	{
		return extNum;
	}

	public void setExtNum(String extNum)
	{
		this.extNum = extNum;
	}

	public String getMobileNum()
	{
		return mobileNum;
	}

	public void setMobileNum(
					String mobileNum)
	{
		this.mobileNum = mobileNum;
	}

	@Column(unique=true)
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getQq()
	{
		return qq;
	}

	public void setQq(String qq)
	{
		this.qq = qq;
	}

	public String getOther()
	{
		return other;
	}

	public void setOther(String other)
	{
		this.other = other;
	}

	@ManyToOne
	@JoinColumn(name="pos_id")
	public Position getPosition()
	{
		return position;
	}

	public void setPosition(
					Position position)
	{
		this.position = position;
	}	

}
