package com.test.sampleemployee.repository;

import com.test.sampleemployee.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    int addEmployee(Employee employee);
}
