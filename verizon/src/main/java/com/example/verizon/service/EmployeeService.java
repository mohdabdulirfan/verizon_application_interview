package com.example.verizon.service;

import com.example.verizon.entity.Employee;
import com.example.verizon.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public String addEmployee(Employee emp) {
        employeeRepository.save(emp);
        return "Employee "+emp.getEmpId()+" added!";
    }

}
