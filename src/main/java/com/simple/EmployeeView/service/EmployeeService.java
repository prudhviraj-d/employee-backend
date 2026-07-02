package com.simple.EmployeeView.service;

import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.simple.EmployeeView.entity.EmployeeEntity;
import com.simple.EmployeeView.model.EmployeeModel;
import com.simple.EmployeeView.repository.EmployeeRepositorys;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
	
	
	private final ModelMapper modelMapper;

    private final EmployeeRepositorys employeeRepo;

    public EmployeeModel save(EmployeeModel employeeModel) {
    	
    	EmployeeEntity employeeEntity = modelMapper.map(employeeModel, EmployeeEntity.class);
    	
    	System.out.println("EmployeeCode::"+employeeModel.getEmployeeCode()+"   EmployeeName"+employeeModel.getFirstName());
    	
    	System.out.println("EmployeeCodeentity::"+employeeEntity.getEmployeeCode()+"   EmployeeNameentity"+employeeEntity.getFirstName());
    	
    	EmployeeEntity savedEmployeeEntity = employeeRepo.save(employeeEntity);
    	System.out.println("savedEmployeeCodeentity::"+savedEmployeeEntity.getEmployeeCode()+"   SavedEmployeeNameentity"+savedEmployeeEntity.getFirstName());
    
        return   modelMapper.map(savedEmployeeEntity, EmployeeModel.class);
    }

    public List<EmployeeModel> findAll() {
    	
    	List<EmployeeEntity> employeeDetailsList = employeeRepo.findAll();
 
        return employeeDetailsList.stream()
        		.map(employeeList -> modelMapper.map(employeeList, EmployeeModel.class))
        		.toList();
    }
}
