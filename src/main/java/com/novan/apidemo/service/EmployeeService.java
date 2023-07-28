package com.novan.apidemo.service;

import com.novan.apidemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    // save employee
    void addEmployee(Employee employee);

    // get employee
    List<Employee> getAllEmployees();

    // get on employee
    Employee findById(Integer id);

    // update employee
    void updateEmployee(Employee employee);

    // delete employee
    Boolean deleteById(Integer id);
}
