package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/6 10:45*/
 @SpringBootApplication
 @EnableHystrixDashboard
 public class HystrixDashboardMain9001
 {
  public static void main(String[] args)
  {
   SpringApplication.run(HystrixDashboardMain9001.class,args);
  }
 }