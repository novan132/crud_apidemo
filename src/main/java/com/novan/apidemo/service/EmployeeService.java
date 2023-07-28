package com.novan.apidemo.service;

import com.novan.apidemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    // save employee
    Employee addEmployee(Employee employee);

    // get employee
    List<Employee> getAllEmployees();

    // get on employee
    Employee findById(Integer id);

    // update employee
    Employee updateEmployee(Integer id, Employee employee);

    // delete employee
    Boolean deleteById(Integer id);
}
