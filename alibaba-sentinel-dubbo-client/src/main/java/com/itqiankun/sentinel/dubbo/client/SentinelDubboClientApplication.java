package com.itqiankun.sentinel.dubbo.client;

import com.itqiankun.csp.sentinel.slots.block.SentinelRpcException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lion Li
 */
@SpringBootApplication
public class SentinelDubboClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(SentinelDubboClientApplication.class, args);
	}
}
