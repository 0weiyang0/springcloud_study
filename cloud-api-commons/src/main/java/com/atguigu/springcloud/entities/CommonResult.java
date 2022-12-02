package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZangNa
 * @version 1.0
 * @date 2022/12/1 15:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
	private Integer code;
	private String message;
	private T  Data;

	public CommonResult(Integer code,String message){
		this(code,message,null);
	}
}
