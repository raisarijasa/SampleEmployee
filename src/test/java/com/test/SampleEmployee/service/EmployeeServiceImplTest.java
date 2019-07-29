package com.test.SampleEmployee.service;

import com.test.SampleEmployee.helper.Constant;
import com.test.SampleEmployee.model.Employee;
import com.test.SampleEmployee.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

    @Mock
    EmployeeRepository employeeRepository;

    @InjectMocks
    EmployeeServiceImpl employeeService;

    @Mock
    List<Employee> sampleEmployees;

    @Mock
    Employee sampleEmployee;

    @Mock
    Constant constant;

    @Before
    public void init() {
        sampleEmployees = new ArrayList<>();
        sampleEmployee = new Employee(1, "FName1", "LName1", "user.one@email.com");
        sampleEmployees.add(sampleEmployee);
    }

    @Test
    public void getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(sampleEmployee);
        when(employeeRepository.getAllEmployees()).thenReturn(employees);
        List<Employee> serviceResult = employeeService.getAllEmployees();

        Assert.assertEquals(serviceResult, employees);
    }

    @Test
    public void addEmployee() {
        when(employeeRepository.addEmployee(sampleEmployee)).thenReturn(constant.CODE_SUCCESS);
        Employee result = employeeService.addEmployee(sampleEmployee);

        Assert.assertEquals(result.getFirstName(), sampleEmployee.getFirstName());
        Assert.assertEquals(result.getLastName(), sampleEmployee.getLastName());
        Assert.assertEquals(result.getEmail(), sampleEmployee.getEmail());
    }
}
