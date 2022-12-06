package com.atguigu.springcloud;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/5 14:15
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker   //  服务降级，服务熔断
public class PaymentHystrixMain8001 {
public static void main(String[] args)
	{
		SpringApplication.run(PaymentHystrixMain8001.class,args);
	}
}