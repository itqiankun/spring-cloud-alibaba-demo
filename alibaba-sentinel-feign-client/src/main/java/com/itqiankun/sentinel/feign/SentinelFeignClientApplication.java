package com.itqiankun.sentinel.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lion Li
 */
@EnableFeignClients // 启动Feign客户端
@SpringBootApplication
public class SentinelFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelFeignClientApplication.class, args);
	}

}
