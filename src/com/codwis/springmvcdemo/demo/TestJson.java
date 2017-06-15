package com.codwis.springmvcdemo.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codwis.springmvcdemo.dao.EmployeeDao;
import com.codwis.springmvcdemo.entities.Employee;


@Controller
@RequestMapping("/json")
public class TestJson {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@ResponseBody
	@RequestMapping("/testJson")
	public Collection<Employee> testJson(){
		return employeeDao.getAll();
	}
}
