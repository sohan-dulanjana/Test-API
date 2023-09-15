package com.example.TestAPI.employee;


import com.example.TestAPI.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/employee")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public String  createEmployeeDetails(@RequestBody Employee employee)
    {
        employeeService.createEmployee(employee);
        return "Created Successfully";
    }

}
