package com.cc.eureka.component;

import com.cc.eureka.service.SchedualServiceHi;

public class FeignFallBack implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		return "error";
	}

}
