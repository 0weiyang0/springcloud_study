package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/1 17:47
 */

public interface PaymentService {
	int create(Payment payment);
	Payment getPaymentById(@Param("id") Long id);
}
