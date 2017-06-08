package org.qixi.employeeBasicInfo.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfo;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})

public class TestEmployeeBasicInfoDao
{
	@Resource
	EmployeeBasicInfoDaoImpl daoImpl;
			
	@Test
    public void testGetById_suc()
    {
		EmployeeBasicInfo employee = daoImpl.getById(1);
		
		assertNotNull(employee);
		assertEquals(employee.getName(), "生产员1");
		assertEquals("sehngchanyg@cheerway.com", employee.getEmail());
		assertEquals("2453", employee.getExtNum());
		
    }
	
	@Test 
	public void testGetById_invalidId()
	{
		EmployeeBasicInfo employee = daoImpl.getById(65535);
		
		assertNull(employee);
	}
	
	@Ignore
	public void testAddNew_suc()
	{
		EmployeeBasicInfo employee = new EmployeeBasicInfo(1, "业务员1", "2756", "18569869589", "yewuyuan1x@cheeyway.com", "45456456", 3);
		assertEquals(1, daoImpl.addNew(employee));
		
	}
	
	@Test 
	public void testDelById()
	{
		assertTrue(daoImpl.delById(20) == 0);
	}
	
	@Test
	public void testGetByName()
	{
		List<EmployeeBasicInfo> list  = daoImpl.getByName("业务员1");
		
		assertEquals(2, list.size());
		assertEquals(3, list.get(0).getId());				
	}
	
	@Test
	public void testUpdate()
	{
		EmployeeBasicInfo info = new EmployeeBasicInfo(4,"业务员1", "2756", "18569869589", "yewuyuan1x@cheeyway.com", "45456456", 3);
		
		assertEquals(1, daoImpl.unpdate(info));
	}
	
	@Test
	public void testGetAll()
	{
		List<EmployeeBasicInfo> employeeBasicInfos = daoImpl.getAll();
		
		assertEquals(4, employeeBasicInfos.size());
	}
}