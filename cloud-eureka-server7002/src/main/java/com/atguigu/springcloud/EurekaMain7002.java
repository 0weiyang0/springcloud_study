package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/2 13:34
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002
{
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaMain7002.class,args);
	}
}
