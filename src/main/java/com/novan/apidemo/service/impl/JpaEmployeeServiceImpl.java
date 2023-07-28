package com.novan.apidemo.service.impl;

import com.novan.apidemo.model.Employee;
import com.novan.apidemo.repository.JpaEmployeeRepository;
import com.novan.apidemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.*;

@RequiredArgsConstructor
@Service
public class JpaEmployeeServiceImpl implements EmployeeService {
    private final JpaEmployeeRepository jpaEmployeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return jpaEmployeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return jpaEmployeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return jpaEmployeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        return jpaEmployeeRepository.findById(id).get();
    }

    @Override
    public Boolean deleteById(Integer id) {
        jpaEmployeeRepository.deleteById(id);
        return TRUE;
    }
}
