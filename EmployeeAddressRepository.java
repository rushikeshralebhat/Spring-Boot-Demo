package com.howtodoinjava.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmployeeAddressEntity;


@Repository
public interface EmployeeAddressRepository 
	 extends JpaRepository<EmployeeAddressEntity, Long> {
}
