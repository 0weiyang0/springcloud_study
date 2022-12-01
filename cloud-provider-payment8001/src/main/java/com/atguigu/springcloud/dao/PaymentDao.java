package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/1 16:40
 */
@Mapper
public interface PaymentDao {
	 int create(Payment payment);
	 Payment getPaymentById(@Param("id") Long id);
}
