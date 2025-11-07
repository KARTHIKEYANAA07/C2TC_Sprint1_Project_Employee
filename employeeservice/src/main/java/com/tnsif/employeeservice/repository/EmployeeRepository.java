package com.tnsif.employeeservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
