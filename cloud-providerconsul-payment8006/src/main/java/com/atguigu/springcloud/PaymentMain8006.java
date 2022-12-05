package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/5 9:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006
{
public static void main(String[] args)
{
	SpringApplication.run(PaymentMain8006.class,args);
}
}
