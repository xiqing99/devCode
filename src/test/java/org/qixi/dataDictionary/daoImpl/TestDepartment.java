package org.qixi.dataDictionary.daoImpl;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.dataDictionary.model.Department;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})

public class TestDepartment{
	
	@Resource
	private DepartmentDaoImpl deptDaoImpl;
	
	@Ignore
	public void testAddNewDept()
	{
		Department dept = new Department();
		dept.setName("测试部");
		
		try {
			int ret = deptDaoImpl.addNew(dept);
			assertTrue(ret == 0);
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}		
	}
	
	@Test
	public void TestSelectByIdValidId()
	{
		Department dept = deptDaoImpl.getById(1);
		assertNotNull(dept);
		assertEquals("生产部", dept.getName());
	}
	
	@Test
	public void TestSelectByIdInValidId()
	{
		Department dept = deptDaoImpl.getById(65535);
		assertNull(dept);		
	}
	
	@Test
	public void TestSelectByNameValid()
	{
		Department dept = deptDaoImpl.getByName("生产部");
		assertNotNull(dept);
		assertEquals(1, dept.getId());				
	}
	
	@Test
	public void TestSelectByNameInvalid()
	{
		Department dept = deptDaoImpl.getByName("未知部");
		assertNull(dept);
	}
	
	@Test
	public void TestGetAll()
	{
		List<Department> list = deptDaoImpl.getAll();
		
		assertEquals(list.size(), 5);
	}
	
	@Test
	public void testGetNameList()
	{
		List<String> list = deptDaoImpl.getNameList();
		
		assertEquals(list.size(), 5);
		assertEquals("生产部", list.get(0));
		assertEquals("测试部", list.get(4));
	}
}
