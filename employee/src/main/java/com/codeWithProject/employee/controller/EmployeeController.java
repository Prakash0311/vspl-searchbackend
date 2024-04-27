package com.codeWithProject.employee.controller;

import com.codeWithProject.employee.entity.Employee;
import com.codeWithProject.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }
}