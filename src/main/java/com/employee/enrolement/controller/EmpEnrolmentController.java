package com.employee.enrolement.controller;

import com.employee.enrolement.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpEnrolmentController {

    @PostMapping("/add")
    ResponseEntity<Employee> addNewEmployee(@RequestBody Employee employee){
        return null;
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return null;
    }
    @GetMapping("/getAny/{id}")
    public ResponseEntity<Employee> getAnyEmployee(@PathVariable String id){
        return null;
    }
    @PutMapping("/updateAny/{id}")
    public ResponseEntity<Employee> updateAnyEmployee(@RequestBody Employee employee, @PathVariable String id){
        return null;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> deleteAny(@PathVariable String id){
        return null;
    }
}
