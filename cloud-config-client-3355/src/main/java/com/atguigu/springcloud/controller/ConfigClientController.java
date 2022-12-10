package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/7 14:13
 */
@RestController
@RefreshScope    //   config客户端动态刷新问题
public class ConfigClientController
{
@Value("${config.info}")
private String configInfo;

@GetMapping("/configInfo")
public String getConfigInfo()
{
	return configInfo;
}
}