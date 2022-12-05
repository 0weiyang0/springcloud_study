package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/2 9:41
 */
/**
 * 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，形如：
 * @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
 * name:表示去调用CLOUD-PAYMENT-SERVICE微服务
 *
 * 注意：微服务名称大写算法会改变成功，改为小写时还是默认的轮询算法(未改变)->亲测
 *
 */
@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
@EnableDiscoveryClient
public class OrderMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain80.class,args);
	}
}
