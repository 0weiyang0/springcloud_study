package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/6 15:04
 *
 * yml文件就行，不用这个
 */
@Configuration
public class GateWayConfig {
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder)
	{
		RouteLocatorBuilder.Builder routes = builder.routes();

		//    请求localhost:9527//guonei   ------->     http://news.baidu.com/guonei
		routes.route("path_route_atguigu",
				r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();

		return routes.build();

	}
	@Bean
	public RouteLocator customRouteLocator2(RouteLocatorBuilder builder)
	{
		RouteLocatorBuilder.Builder routes = builder.routes();
		routes.route("path_route_atguigu2", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
		return routes.build();
	}




}
