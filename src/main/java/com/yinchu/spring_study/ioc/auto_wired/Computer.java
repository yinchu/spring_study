package com.yinchu.spring_study.ioc.auto_wired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private ComputerSystem cs;

	public ComputerSystem getCs() {
		return cs;
	}
	
	@Autowired
	public void setCs(ComputerSystem cs) {
		this.cs = cs;
	}
	
	public String work(ComputerSystem cs) {
		return cs.work();
	}
}
