package com.example.TestAPI.Service;

import com.example.TestAPI.employee.Employee;

public interface EmployeeService {

    public String createEmployee(Employee employee);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(Employee employee);
}
