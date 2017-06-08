package org.qixi.employeeBasicInfo.bo;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfo;
import org.qixi.employeeBasicInfo.model.EmployeeBasicInfoVo;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})

public class TestEmployeeBasicInfoBo
{
	@Resource
	EmployeeBasicInfoBo infoBo;
	
	@Test
	public void testGetBasicInfoByEmpId()
	{
		EmployeeBasicInfoVo vo = infoBo.getBasicInfoByEmpId(1);
		
		assertNotNull(vo);
		assertEquals(vo.getDeptName(), "生产部");
		assertEquals(vo.getEmail(), "sehngchanyg@cheerway.com");
		assertEquals(vo.getExtNum(), "2453");
	}
	
	@Test
	public void testGetBasicInfoByEmpId_invalidId()
	{
		EmployeeBasicInfoVo vo = infoBo.getBasicInfoByEmpId(65534);
		
		assertNull(vo);
	}
	
	@Test
	public void testUpdateEmpBasicInfo()
	{
		EmployeeBasicInfoVo vo = infoBo.getBasicInfoByEmpId(2);
		
		vo.setName("生产经理2");
		vo.setDeptName("业务部");
		
		infoBo.updateEmpBasicInfo(vo);
		
		vo = infoBo.getBasicInfoByEmpId(2);
		
		assertNotNull(vo);
		
		assertEquals("生产经理2", vo.getName());
		assertEquals("业务部", vo.getDeptName());
		
		
	}
	
}