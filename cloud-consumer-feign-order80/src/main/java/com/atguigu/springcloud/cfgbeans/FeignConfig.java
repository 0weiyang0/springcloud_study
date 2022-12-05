package com.atguigu.springcloud.cfgbeans;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/5 13:53
 */
@Configuration
public class FeignConfig {
//	配置日志打印功能
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

}