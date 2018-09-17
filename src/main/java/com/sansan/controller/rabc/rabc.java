package com.sansan.controller.rabc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sansan.common.Response;

@RestController
@RequestMapping("/rabc")
public class rabc {	
	
	@RequestMapping(value="/resourceTest", method=RequestMethod.GET, produces={ "application/json;charset=UTF-8" })
	@ResponseBody
	public Response rabc(){
		System.out.println("����GET������");
		return new Response().success();
	}
	
	@RequestMapping(value="/resourceTest", method=RequestMethod.POST, produces={ "application/json;charset=UTF-8" })
	@ResponseBody
	public Response rabctwo(){
		System.out.println("����POST������");
		return new Response().success();
	}
}
