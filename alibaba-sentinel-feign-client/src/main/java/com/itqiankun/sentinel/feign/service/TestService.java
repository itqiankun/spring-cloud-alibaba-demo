package com.itqiankun.sentinel.feign.service;

import com.itqiankun.sentinel.feign.fallback.TestServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lion Li
 */
@FeignClient(name = "alibaba-sentinel-feign-server",
		fallback = TestServiceFallback.class)
public interface TestService {

	/**
	 * 调用服务提供端的接口.
	 */
	@PostMapping("/test")
	String test(@RequestParam("name") String name);

}
