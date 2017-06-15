package com.codwis.springmvcdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Param")
public class RequestParamController {

	private static final String SUCCESS = "success";
	
	/**
	 * @RequestParam ��ӳ���������. value ֵ����������Ĳ����� required �ò����Ƿ����. Ĭ��Ϊ true
	 *               defaultValue ���������Ĭ��ֵ
	 */
	@RequestMapping(value = "/testRequestParam")
	public String testRequestParam(
			@RequestParam(value = "username") String un,
			@RequestParam(value = "age", required = false, defaultValue = "0") int age) {
		System.out.println("testRequestParam, username: " + un + ", age: "
				+ age);
		return SUCCESS;
	}
	
	
	
	/**
	 * �˽�:
	 * 
	 * @CookieValue: ӳ��һ�� Cookie ֵ. ����ͬ @RequestParam
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println("testCookieValue: sessionId: " + sessionId);
		return SUCCESS;
	}

	/**
	 * �˽�: ӳ������ͷ��Ϣ �÷�ͬ @RequestParam
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(
			@RequestHeader(value = "Accept-Language") String al) {
		System.out.println("testRequestHeader, Accept-Language: " + al);
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
