package com.codwis.springmvcdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*@RequestMapping除了可以使用请求URL映射请求外,还可以使用请求方法 请求参数以及请求头映射请求 他们之间的关系是与的关系,联合多个条件可以让
请求的控制更加精细化
以下是分别演示映射请求参数 请求方法和请求头
@RequestMapping("/testRequestMapping")
@RequestMapping(value = "/testMethod", method = RequestMethod.POST)
@RequestMapping(value = "testParamsAndHeaders", params = { "username",
"age!=10" }, headers = { "Accept-Language=en-US,zh;q=0.8" })
*/
@Controller
@RequestMapping("/requestMapperController")
public class RequestMappingController {

	private static final String SUCCESS = "success";
	
	/**
	 * 1. @RequestMapping 除了修饰方法, 还可来修饰类 2. 1). 类定义处: 提供初步的请求映射信息。相对于 WEB 应用的根目录
	 * 2). 方法处: 提供进一步的细分映射信息。 相对于类定义处的 URL。若类定义处未标注 @RequestMapping，则方法处标记的 URL
	 * 相对于 WEB 应用的根目录
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}


    /**
	 * 常用: 使用 method 属性来指定请求方式
	 */
	@RequestMapping(value = "/testMethod", method = RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}

	/**
	 * 了解: 可以使用 params 和 headers 来更加精确的映射请求. params 和 headers 支持简单的表达式.
	 * 
	 * @return
	 */
	@RequestMapping(value = "testParamsAndHeaders", params = { "username",
			"age!=10" }, headers = { "Accept-Language=en-US,zh;q=0.8" })
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}

    /*Ant风格资源地址支持3中匹配符 
    ? 匹配文件名中的一个字符
    * 匹配文件名中的任意字符
    ** 匹配多层路径*/
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	//@PathVariable映射URL绑定的占位符
	//通过@PathVariable可以将URL中占位符参数绑定到控制器处理方法的入参中
	//URL中的{XXX}占位符可以通过@PathVariable("XXX")绑定到操作方法的入参中 如下
	/**
	 * @PathVariable 可以来映射 URL 中的占位符到目标方法的参数中.
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable: " + id);
		return SUCCESS;
	}
	
}
