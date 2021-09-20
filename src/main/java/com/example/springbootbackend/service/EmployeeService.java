package com.example.springbootbackend.service;

import com.example.springbootbackend.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmploye(Employee employee);
    List<Employee> getAllEmployees();
}
