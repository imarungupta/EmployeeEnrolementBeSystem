package com.employee.enrolement.service;

import com.employee.enrolement.model.Employee;
import com.employee.enrolement.repository.EmplpoyeeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpServiceImpl implements EmpServiceInterface{

    @Autowired
    private EmplpoyeeRepoInterface repoInterface;
    @Override
    public Employee saveEmployee(Employee employee) {
        return repoInterface.save(employee);
    }
    @Override
    public List<Employee> getAllEmployee() {
        return repoInterface.findAll();
    }
    @Override
    public Employee getEmpById(String id) {
        return repoInterface.findById(id).get();
    }
    @Override
    public Employee updateEmployeeById(Employee employee) {
        return repoInterface.save(employee);
    }
    @Override
    public void deleteEmpById(String id) {
        repoInterface.deleteById(id);
    }
}
