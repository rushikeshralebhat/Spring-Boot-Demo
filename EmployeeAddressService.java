package com.howtodoinjava.demo.service;


import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.EmployeeAddressEntity;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.repository.EmployeeAddressRepository;
@Service
public class EmployeeAddressService {
  
	@Autowired
	EmployeeAddressRepository employeeAddressRepository;
	
	 public EmployeeAddressEntity createOrUpdateEmployeeAddress(EmployeeAddressEntity entity) throws RecordNotFoundException
	    {
	         
	        if(entity.getId()!=null)
	        {
	        	 EmployeeAddressEntity employeeAddress = employeeAddressRepository.getOne(entity.getId());
	  	       
	        	employeeAddress.setAddressline1(entity.getAddressline1());
	        	employeeAddress.setAddressline2(entity.getAddressline2());
	        	employeeAddress.setState(entity.getState());
	        	employeeAddress.setCity(entity.getCity());
	        	employeeAddress.setPin(entity.getPin());
		         
	          	employeeAddress = employeeAddressRepository.save(employeeAddress);
	             
	            return employeeAddress;
	        
	          } else {
	            EmployeeAddressEntity newEntity = new EmployeeAddressEntity();
	            newEntity.setAddressline1(entity.getAddressline1());
	            newEntity.setAddressline2(entity.getAddressline2());
	            newEntity.setState(entity.getState());
	            newEntity.setCity(entity.getCity());
	            newEntity.setPin(entity.getPin());
	            
	            newEntity = employeeAddressRepository.save(newEntity);
	             
	            return newEntity;
	        
	          }
	    }
}

