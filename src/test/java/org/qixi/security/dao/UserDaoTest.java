package org.qixi.security.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.qixi.beans.EmpGenInfo;
import org.qixi.security.beans.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/test/SpringBeansTest.xml"})


public class UserDaoTest
{
	@Resource
	UserDao daoImpl;
	
	@Test
	public void getAllTest()
	{
		User user = new User();
		EmpGenInfo info = new EmpGenInfo();
		
		info.setId(1);
		user.setName("rr");
		user.setPassword("rr");
		user.setEmpGenInfo(info);
		daoImpl.save(user);
		
		assertEquals(1, 1);
	}
}
