package org.qixi.login.dao;

import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.dataDictionary.model.Department;
import org.qixi.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})


public class UserDaoImplTest{
	
	@Resource
	private UserDaoImpl daoImpl;
	
	@Test
	public void testFindUserByNameAndPass()
	{		
		User user = null;
		
		try {
			user = daoImpl.findUserByNameAndPass("shengchanyg1", "0000");
			assertTrue(user.getEmployeeId() == 1);
		} catch (Exception e) {
			System.out.println(e.toString());
			assertTrue(false);
		}		
	}
	
}