package com.yinchu.spring_study.ioc.java_wired;

public class Computer {
	
	private ComputerSystem cs;

	public ComputerSystem getCs() {
		return cs;
	}
	
	public void setCs(ComputerSystem cs) {
		this.cs = cs;
	}
	
	public String work(ComputerSystem cs) {
		return cs.work();
	}
}
