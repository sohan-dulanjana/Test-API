package com.example.TestAPI.repository;

import com.example.TestAPI.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

// add method if you have
}
