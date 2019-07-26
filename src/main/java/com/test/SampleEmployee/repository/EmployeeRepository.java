package com.test.SampleEmployee.repository;

import com.test.SampleEmployee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1, "FName123", "LName1", "user.one@email.com"));
        list.add(new Employee(2, "FName2", "LName2", "user.two@email.com"));
        list.add(new Employee(3, "FName3", "LName3", "user.three@email.com"));
        list.add(new Employee(4, "FName4", "LName4", "user.four@email.com"));
        list.add(new Employee(5, "FName5", "LName5", "user.five@email.com"));
    }

    public List<Employee> getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.add(employee);
    }
}
