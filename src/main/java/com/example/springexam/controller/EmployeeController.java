package com.example.springexam.controller;

import com.example.springexam.entity.Employee;
import com.example.springexam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Employee> getList() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
}
