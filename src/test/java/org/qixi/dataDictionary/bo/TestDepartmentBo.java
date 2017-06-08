package org.qixi.dataDictionary.bo;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})

public class TestDepartmentBo
{
	@Resource
	private DepartmentBo deptBo;
	
	@Test
	public void testGetDeptNameList()
	{
		List<String> nameList = deptBo.getDeptNameList();
		
		assertEquals(5, nameList.size());
		assertEquals("生产部", nameList.get(0));
		assertEquals("测试部", nameList.get(4));
	}
}