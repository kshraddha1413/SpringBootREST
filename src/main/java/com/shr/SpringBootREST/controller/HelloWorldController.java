package com.shr.SpringBootREST.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shr.SpringBootREST.model.Employee;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World Developer!!!";
	}

	@RequestMapping("/hello1")
	public Employee getEmployee() {
		Employee emp1 = new Employee("mark", 100.00);
		return emp1;
	}

	@RequestMapping("/hello2")
	public List<Employee> getEmployeeList() {
		Employee emp1 = new Employee("mark", 100.00);
		Employee emp2 = new Employee("mike", 99.00);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		return list;
	}

	@RequestMapping("/hello3")
	public Employee addEmployee(@RequestBody Employee e) {
		return e;
	}

	@RequestMapping("/hello4")
	public List<Employee> addEmployeeList(@RequestBody List<Employee> e) {
		return e;
	}

	@RequestMapping("/hello5/{id}")
	public String getById(@PathVariable("id") String id) {
		return id;
	}
	
	@RequestMapping("/hello6")
	public String getByQueryParamater(@RequestParam("name") String name) {
		return name;
	}
}
