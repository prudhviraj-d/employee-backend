package com.simple.EmployeeView.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.simple.EmployeeView.model.EmployeeModel;
import com.simple.EmployeeView.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@CrossOrigin("*")
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping
    public EmployeeModel save(@RequestBody EmployeeModel employeeModel) {
    	
    	System.out.println("EmployeeCode::"+employeeModel.getEmployeeCode()+"   EmployeeName"+employeeModel.getFirstName());
    	
        return service.save(employeeModel);
    }

    @GetMapping
    public List<EmployeeModel> getAll() {
        return service.findAll();
    }
}