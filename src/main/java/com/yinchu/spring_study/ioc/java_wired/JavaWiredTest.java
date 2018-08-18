package com.yinchu.spring_study.ioc.java_wired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComputerConfig.class)
public class JavaWiredTest {
	
	@Autowired
	private ComputerSystem cs;
	
	@Autowired
	private Computer pc;
	
	public final String word = "我是Windows...";
	
	@Test
	public void csShouldNotBeNull() {
		assertNotNull(cs);
	}
	
	@Test
	public void pcWord() {
		String pcWorkLog = pc.work(cs);
		assertEquals(word, pcWorkLog);
	}
}
