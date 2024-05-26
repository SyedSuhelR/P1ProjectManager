package com.example.springboot.crud.operation.controller;

import com.example.springboot.crud.operation.model.Employee;
import com.example.springboot.crud.operation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public ResponseEntity<Employee>  createEmployee(@RequestBody Employee employee) {

        Employee emp = employeeRepository.save(employee);

        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

//    @GetMapping
//    public List<Employee> getEmployee(@RequestBody Long id){
//        return employeeRepository.findAll();
//    }
}
