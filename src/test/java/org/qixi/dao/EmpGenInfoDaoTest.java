package org.qixi.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.antlr.grammar.v3.ANTLRParser.delegateGrammar_return;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.beans.Department;
import org.qixi.beans.EmpGenInfo;
import org.qixi.beans.Position;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})


public class EmpGenInfoDaoTest
{

	@Resource 
	private  EmpGenInfoDao dao;	
	
	@Test
	public void testGetByName()
	{	
		List<EmpGenInfo> empList = dao.getByName("李三");
		assertEquals(1, empList.size());
	}
	
	@Test
	public void testGetByEmail()
	{

		EmpGenInfo emp = dao.getByEmail("lisan@cheeyway.com");
		
		assertEquals("李三", emp.getName());

	}
	
	@Test
	public void TestGetNamelistByPos()
	{
		List<String> nameList = dao.getNameListByPos(1);
//		assertEquals(1, nameList.size());
//		assertEquals("李三", nameList.get(0));
	}
	
	@Test
	public void testGetNumOfEmpForDept()
	{
		long num = dao.getNumOfEmpForDept(2);
		
		assertEquals(1, num);
	}
	
	@Test
	public void testGelAll()
	{
		List<EmpGenInfo> empList = dao.getAll();
		
		assertEquals(2, empList.size());
	}
	
	private void save()
	{
		EmpGenInfo emp = new EmpGenInfo();
		
		Position position= new Position();
		position.setId(1);
		
		Department dept = new Department();
		dept.setId(2);
		
		emp.setName("李三");
		emp.setEmail("lisan@cheeyway.com");
		emp.setPosition(position);
		emp.setDept(dept);
		
		dao.save(emp);
	}
	
	private void del()
	{
		dao.deleteById(1);
	}	
}
