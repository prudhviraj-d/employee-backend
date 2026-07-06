package com.simple.EmployeeView.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeModel {
	
		private Long id;

	    private String employeeCode;

	    private String firstName;

	    private String lastName;

	    private String email;

	    private Double salary;

	    private String department;
	    
	    private String phoneNumber;

}
