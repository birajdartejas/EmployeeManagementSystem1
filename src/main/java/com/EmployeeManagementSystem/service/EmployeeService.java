package com.EmployeeManagementSystem.service;

import java.util.List;

import com.EmployeeManagementSystem.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}