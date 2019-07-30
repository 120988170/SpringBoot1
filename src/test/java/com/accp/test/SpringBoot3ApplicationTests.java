package com.accp.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.biz.StaffBiz;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot3ApplicationTests {

	@Autowired
	private StaffBiz biz;
	
	@Test
	public void contextLoads() {
		System.out.println(biz.selectAll().size());
	}

}
