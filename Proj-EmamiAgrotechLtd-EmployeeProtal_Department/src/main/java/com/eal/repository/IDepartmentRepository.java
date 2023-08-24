package com.eal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eal.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
