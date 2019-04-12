package com.cc.eureka.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cc.eureka.component.FeignFallBack;

//TODO: feign中集成了Hystrix, fallback做熔断降级用
@FeignClient(value="service-one", fallback = FeignFallBack.class)
public interface SchedualServiceHi {

	@RequestMapping("/hi")
	String sayHiFromClientOne(@RequestParam(value="name") String name);
}
