package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/5 10:04
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule(){
		return new RandomRule();//定义为随机
	}
}