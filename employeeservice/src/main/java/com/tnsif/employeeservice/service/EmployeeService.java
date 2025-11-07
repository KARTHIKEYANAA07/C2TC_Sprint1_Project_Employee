package com.tnsif.employeeservice.service;

import com.tnsif.employeeservice.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    String deleteEmployee(Long id);
}
