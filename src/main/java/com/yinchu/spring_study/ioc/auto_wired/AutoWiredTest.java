package com.yinchu.spring_study.ioc.auto_wired;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringStudyConfig.class)
public class AutoWiredTest {
	@Autowired
	private ComputerSystem cs;
	
	@Test
	public void csShouldNotBeNull() {
		assertNotNull(cs);
	}

}
