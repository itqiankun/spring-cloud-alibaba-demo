package com.itqiankun.sentinel.feign.fallback;

import com.itqiankun.sentinel.feign.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @author Lion Li
 * sentinel 降级处理
 */
@Component
public class TestServiceFallback implements TestService {

	@Override
	public String test(String name) {
		return "服务消费端::降级";
	}

}
