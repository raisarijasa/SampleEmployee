package com.test.SampleEmployee.service;

import com.test.SampleEmployee.helper.Constant;
import com.test.SampleEmployee.model.Employee;
import com.test.SampleEmployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        int status = employeeRepository.addEmployee(employee);
        if (status == Constant.CODE_SUCCESS) {
            return employee;
        } else {
            return new Employee();
        }
    }
}
