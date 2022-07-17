package com.employee.enrolement.service;

import com.employee.enrolement.model.Employee;

import java.util.List;

public interface EmpServiceInterface {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee getEmpById(String id);
    public Employee updateEmployeeById(Employee employee);
    public void deleteEmpById(String id);

}
