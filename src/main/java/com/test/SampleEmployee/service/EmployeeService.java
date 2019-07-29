package com.test.SampleEmployee.service;

import com.test.SampleEmployee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);
}
