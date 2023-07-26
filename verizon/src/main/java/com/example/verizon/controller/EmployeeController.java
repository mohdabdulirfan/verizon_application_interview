package com.example.verizon.controller;

import com.example.verizon.entity.Employee;
import com.example.verizon.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/all")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }
    @PostMapping("/add")
    public String addEmployee (@RequestBody Employee emp) {
        return employeeService.addEmployee(emp);
    }

}
