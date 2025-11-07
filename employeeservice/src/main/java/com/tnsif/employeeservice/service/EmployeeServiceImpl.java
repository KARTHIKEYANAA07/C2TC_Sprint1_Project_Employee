package com.tnsif.employeeservice.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.employeeservice.repository.EmployeeRepository;
import com.tnsif.employeeservice.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        return empRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return empRepo.findById(id).orElse(null);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = empRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(employee.getName());
            existing.setRole(employee.getRole());
            existing.setSalary(employee.getSalary());
            existing.setPhone(employee.getPhone());
            existing.setEmail(employee.getEmail());
            existing.setDepartment(employee.getDepartment());
            return empRepo.save(existing);
        }
        return null;
    }

    @Override
    public String deleteEmployee(Long id) {
        empRepo.deleteById(id);
        return "Employee Deleted Successfully";
    }
}
