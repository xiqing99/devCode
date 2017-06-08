package org.qixi.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.beans.Department;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})

public class DepartmentTest
{
	@Resource 
	DepartmentDao dao;
	
	@Ignore
	public void testSave()
	{
		Department dept1 = new Department("总公司");
		Department dept01 = new Department("分公司1");
		Department dept02 = new Department("分公司2");

		dept01.setSupDept(dept1);
		dept02.setSupDept(dept1);
		
		dept1.getSubDept().add(dept01);
		dept1.getSubDept().add(dept02);
		
		dao.save(dept1);
	}	
	
	@Ignore
	public void testGet()
	{
		testSave();
		Department dept = dao.Get(1);
		
//		printDept(dept, 0);
	}
	
	@Test
	public void getDeptWithoutEmpTest()
	{
		List<Department> deptList = dao.getDeptWithoutEmp();
		
		assertEquals(2, deptList.size());
	}
	
	
	private void printDept(Department dept, int level)
	{
		String index = "";
		for(int i=0; i<level;i++)
			index+="  ";
		
		System.out.println(index + dept.getName());
		for(Department subDept : dept.getSubDept())
		{
			printDept(subDept, level + 1);
		}
	}
}
