package com.example.gcompany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gcompany.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
	
	
	public List<Employee>	findByEnameContains(String name);
}