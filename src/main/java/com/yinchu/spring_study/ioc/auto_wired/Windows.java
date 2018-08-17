package com.yinchu.spring_study.ioc.auto_wired;

import org.springframework.stereotype.Component;

@Component
public class Windows implements ComputerSystem {

	public String work() {
		// TODO Auto-generated method stub
		return "我是Windows...";
	}

}
