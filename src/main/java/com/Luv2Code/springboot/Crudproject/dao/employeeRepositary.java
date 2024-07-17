package com.Luv2Code.springboot.Crudproject.dao;

import com.Luv2Code.springboot.Crudproject.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepositary extends JpaRepository<employee,Integer> {
    //no implementation
}
