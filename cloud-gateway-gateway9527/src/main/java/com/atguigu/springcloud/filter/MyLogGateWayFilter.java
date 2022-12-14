package com.atguigu.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/6 17:10
 */

/**
 * Order是定义优先级    数字越小，优先级越高
 */
@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("自定义过滤器------->  MyLogGateWayFilter ---->时间" + new Date());
		String uname = exchange.getRequest().getQueryParams().getFirst("uname");
		if (uname == null){
			log.info("用户名为空----->非法用户");
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}
		return chain.filter(exchange);
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
