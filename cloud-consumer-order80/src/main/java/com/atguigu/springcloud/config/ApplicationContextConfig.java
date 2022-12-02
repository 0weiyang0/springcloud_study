package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/2 9:50
 */
@Configuration
public class ApplicationContextConfig {

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}


}
