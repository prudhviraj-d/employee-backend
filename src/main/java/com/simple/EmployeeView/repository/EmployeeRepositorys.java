package com.simple.EmployeeView.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simple.EmployeeView.entity.EmployeeEntity;

public interface EmployeeRepositorys extends JpaRepository<EmployeeEntity, Long> {

}
