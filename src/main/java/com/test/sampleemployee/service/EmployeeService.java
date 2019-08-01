package com.test.sampleemployee.service;

import com.test.sampleemployee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);
}
