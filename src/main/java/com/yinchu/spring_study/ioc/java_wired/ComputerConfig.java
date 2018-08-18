package com.yinchu.spring_study.ioc.java_wired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {
	
	@Bean
	public ComputerSystem windows() {
		return new Windows();
	}
	
	@Bean
	public Computer computer() {
		Computer pc = new Computer();
		pc.setCs(windows());
		return pc; 
	}
}
