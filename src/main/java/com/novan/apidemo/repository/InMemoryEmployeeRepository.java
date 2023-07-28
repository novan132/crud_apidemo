package com.novan.apidemo.repository;

import com.novan.apidemo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

@Repository
public class InMemoryEmployeeRepository {
    private static final List<Employee> DATABASE = new ArrayList<>();
    static {
        DATABASE.add(new Employee(1, "John", "Smith", "john@mail.com"));
        DATABASE.add(new Employee(2, "Alex", "Smith", "alex@mail.com"));
        DATABASE.add(new Employee(3, "David", "Smith", "david@mail.com"));
    }

    void addEmployee(Employee employee) {
        DATABASE.add(employee);
    }

    List<Employee> getAllEmployees() {
        return List.copyOf(DATABASE);
    }

    Employee findById(Integer id) {
        return DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
    }

    void updateEmployee(Employee employee) {
        Employee emp_obj = DATABASE
                .stream()
                .filter(emp -> employee.getId().equals(emp.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE.set(emp_obj.getId(), employee);
    }

    Boolean deleteById(Integer id) {
        Employee employee = DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
        DATABASE.remove(employee);
        return TRUE;
    }
}