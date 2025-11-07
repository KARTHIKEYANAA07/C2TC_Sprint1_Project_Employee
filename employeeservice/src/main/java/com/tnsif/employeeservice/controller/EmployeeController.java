package com.tnsif.employeeservice.controller;


import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.tnsif.employeeservice.service.EmployeeService;
import com.tnsif.employeeservice.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empService.addEmployee(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return empService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return empService.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return empService.deleteEmployee(id);
    }
}
