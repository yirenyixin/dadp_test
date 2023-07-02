package com.gientech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableScheduling
@EnableAsync // 开启异步调用(操作日志要用)
public class StartSys {

	public static void main(String[] args) {

		SpringApplication.run(StartSys.class, args);

		System.out.println("---------------sys启动成功---------------");
	}

}
