package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/1 17:50
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@PostMapping("/payment/create")
	public CommonResult create(Payment payment){
		int result = paymentService.create(payment);
		if (result > 0){
			log.info("插入payment成功");
			return new CommonResult(200,"插入payment成功",result);
		}else {
			log.info("插入payment失败");
			return new CommonResult(444,"插入payment失败",-1);
		}
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable("id") Long id){
		Payment payment = paymentService.getPaymentById(id);
		if (payment == null){
			log.info("查询失败");
			return new CommonResult(444,"查询",-1);
		}
		log.info("查询成功");
		return new CommonResult(200,"查询成功",payment);
	}

}
