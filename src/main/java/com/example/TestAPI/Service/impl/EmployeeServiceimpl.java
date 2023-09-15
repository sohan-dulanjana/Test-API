package com.example.TestAPI.Service.impl;

import com.example.TestAPI.Service.EmployeeService;
import com.example.TestAPI.employee.Employee;
import com.example.TestAPI.repository.EmployeeRepository;

public class EmployeeServiceimpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceimpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }



    @Override
    public String createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Success";
    }

    @Override
    public String updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public String deleteEmployee(Employee employee) {
        return null;
    }
}
