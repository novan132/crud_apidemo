package com.novan.apidemo.service.impl;

import com.novan.apidemo.model.Employee;
import com.novan.apidemo.repository.InMemoryEmployeeRepository;
import com.novan.apidemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Qualifier(value = "inMemoryService")
public class InMemoryEmployeeServiceImpl implements EmployeeService {
    private final InMemoryEmployeeRepository inMemoryEmployeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return inMemoryEmployeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryEmployeeRepository.getAllEmployees();
    }

    @Override
    public Employee findById(Integer id) {
        return inMemoryEmployeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        return inMemoryEmployeeRepository.updateEmployee(id, employee);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryEmployeeRepository.deleteById(id);
    }
}
