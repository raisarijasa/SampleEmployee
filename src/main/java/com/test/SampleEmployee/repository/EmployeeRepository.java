package com.test.SampleEmployee.repository;

import com.test.SampleEmployee.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    int addEmployee(Employee employee);
}
