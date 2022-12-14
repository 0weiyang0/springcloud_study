package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/5 16:59
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

	@Override
	public String paymentInfo_OK(Integer id) {
		return "----------------PaymentFallbackService fall back   paymentInfo_OK";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "----------------PaymentFallbackService fall back   paymentInfo_TimeOut";
	}

}

