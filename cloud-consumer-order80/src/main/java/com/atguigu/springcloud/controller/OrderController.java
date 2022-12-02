package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/2 9:57
 */
@RestController
public class OrderController {


	private static final String PAYMENT_URL = "http://localhost:8001/";

	@Resource
	private RestTemplate restTemplate;

	@PostMapping("/consumer/payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		return 	restTemplate.postForObject(PAYMENT_URL + "payment/create" ,
											payment,
											CommonResult.class);
	}

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
		return 	restTemplate.getForObject(PAYMENT_URL + "payment/get/" + id ,
				CommonResult.class);
	}






}
