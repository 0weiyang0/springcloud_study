package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/7 15:37
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
		public static void main(String[] args) {
			SpringApplication.run(ConfigClientMain3366.class,args);
		}
}