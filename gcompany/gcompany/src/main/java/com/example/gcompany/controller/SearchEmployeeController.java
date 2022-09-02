package com.example.gcompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.gcompany.domain.Employee;
import com.example.gcompany.service.EmployeeService;

public class SearchEmployeeController  {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("index")
	public String viewHomePage1(Model model, @Param("keyword")String keyword) {
		List<Employee> listEmployee = service.listAll(keyword);
		
		
		model.addAttribute("listEmployee", listEmployee);
		model.addAttribute("keyword", keyword);
		return "index";}	
}