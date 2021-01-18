package com.ht.probation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ht.probation.dao.base.RoleDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoTest {
	
	@Autowired
	private RoleDao roleDao;
	
	@Test
	public void testDao() {
		System.out.println(roleDao.selectById("1"));
	}

}
