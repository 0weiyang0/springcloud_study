package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/1 13:54
 */
@SpringBootApplication
@EnableEurekaClient//表示eureka client客户端
public class PaymentMain8001 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8001.class,args);
	}
}
