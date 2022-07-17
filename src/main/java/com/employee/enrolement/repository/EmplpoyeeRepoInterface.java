package com.employee.enrolement.repository;

import com.employee.enrolement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplpoyeeRepoInterface extends JpaRepository<Employee, String> {
}
