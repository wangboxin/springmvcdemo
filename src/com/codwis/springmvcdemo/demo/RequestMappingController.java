package com.codwis.springmvcdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*@RequestMapping���˿���ʹ������URLӳ��������,������ʹ�����󷽷� ��������Լ�����ͷӳ������ ����֮��Ĺ�ϵ����Ĺ�ϵ,���϶������������
����Ŀ��Ƹ��Ӿ�ϸ��
�����Ƿֱ���ʾӳ��������� ���󷽷�������ͷ
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
	 * 1. @RequestMapping �������η���, ������������ 2. 1). �ඨ�崦: �ṩ����������ӳ����Ϣ������� WEB Ӧ�õĸ�Ŀ¼
	 * 2). ������: �ṩ��һ����ϸ��ӳ����Ϣ�� ������ඨ�崦�� URL�����ඨ�崦δ��ע @RequestMapping���򷽷�����ǵ� URL
	 * ����� WEB Ӧ�õĸ�Ŀ¼
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}


    /**
	 * ����: ʹ�� method ������ָ������ʽ
	 */
	@RequestMapping(value = "/testMethod", method = RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}

	/**
	 * �˽�: ����ʹ�� params �� headers �����Ӿ�ȷ��ӳ������. params �� headers ֧�ּ򵥵ı��ʽ.
	 * 
	 * @return
	 */
	@RequestMapping(value = "testParamsAndHeaders", params = { "username",
			"age!=10" }, headers = { "Accept-Language=en-US,zh;q=0.8" })
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}

    /*Ant�����Դ��ַ֧��3��ƥ��� 
    ? ƥ���ļ����е�һ���ַ�
    * ƥ���ļ����е������ַ�
    ** ƥ����·��*/
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	//@PathVariableӳ��URL�󶨵�ռλ��
	//ͨ��@PathVariable���Խ�URL��ռλ�������󶨵��������������������
	//URL�е�{XXX}ռλ������ͨ��@PathVariable("XXX")�󶨵���������������� ����
	/**
	 * @PathVariable ������ӳ�� URL �е�ռλ����Ŀ�귽���Ĳ�����.
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id) {
		System.out.println("testPathVariable: " + id);
		return SUCCESS;
	}
	
}
