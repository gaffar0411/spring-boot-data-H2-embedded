package com.toolChain.springboot.RestWithH2.service;

import com.toolChain.springboot.RestWithH2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
