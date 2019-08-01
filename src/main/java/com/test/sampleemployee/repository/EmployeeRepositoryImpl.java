package com.test.sampleemployee.repository;

import com.test.sampleemployee.helper.Constant;
import com.test.sampleemployee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> list = new ArrayList<>();

    static {
        list.add(new Employee(1, "FName1", "LName1", "user.one@email.com"));
        list.add(new Employee(2, "FName2", "LName2", "user.two@email.com"));
        list.add(new Employee(3, "FName3", "LName3", "user.three@email.com"));
        list.add(new Employee(4, "FName4", "LName4", "user.four@email.com"));
        list.add(new Employee(5, "FName5", "LName5", "user.five@email.com"));
    }

    public List<Employee> getAllEmployees() {
        return list;
    }

    public int addEmployee(Employee employee) {
        list.add(employee);

        if (list.contains(employee)) {
            return Constant.CODE_SUCCESS;
        } else {
            return Constant.CODE_FAILED;
        }
    }
}
