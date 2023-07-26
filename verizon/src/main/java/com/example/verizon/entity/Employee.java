package com.example.verizon.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Employee {
    @Id
    private long empId;
    private String empName;
    private long salary;

    //private Project project;

    public Employee() {
    }

    public Employee(long empId, String empName, long salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

//    public com.example.verizon.entity.Project getProject() {
//        return project;
//    }
//
//    public void setProject(com.example.verizon.entity.Project project) {
//        this.project = project;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
