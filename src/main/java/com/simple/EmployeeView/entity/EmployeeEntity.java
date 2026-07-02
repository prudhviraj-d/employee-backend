package com.simple.EmployeeView.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees_view")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeCode;

    private String firstName;

    private String lastName;

    private String email;

    private Double salary;

    private String department;
}