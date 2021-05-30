package com.howtodoinjava.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.repository.EmployeeRepository;
import com.howtodoinjava.demo.vm.EmployeeVm;
 
@Service
public class EmployeeService {
     
    @Autowired
    EmployeeRepository repository;
     
    @Autowired
    EmployeeAddressService employeeAddressService;
    
    public List<EmployeeEntity> getAllEmployees()
    {
        List<EmployeeEntity> employeeList = repository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<EmployeeEntity>();
        }
    }
     
    public EmployeeEntity getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<EmployeeEntity> employee = repository.findById(id);
         
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
     
    public EmployeeEntity createOrUpdateEmployee(EmployeeVm employeevm) throws RecordNotFoundException
    {
         
        if(employeevm.getId()!=null)
        {
            EmployeeEntity employee = repository.getOne(employeevm.getId());

        	employee.setEmail(employeevm.getEmail());
        	employee.setFirstName(employeevm.getFirstName());


        	employee.setLastName(employeevm.getLastName());
            employee.setEmployee_address_id(employeeAddressService.createOrUpdateEmployeeAddress(employeevm.getEmployee_address_id()));
        	employee = repository.save(employee);


            return employee;
                    

        } else {
             EmployeeEntity newEntity = new EmployeeEntity();
            
            newEntity.setEmail(employeevm.getEmail());
            newEntity.setFirstName(employeevm.getFirstName());

           
            newEntity.setLastName(employeevm.getLastName());
            newEntity.setEmployee_address_id( employeeAddressService.createOrUpdateEmployeeAddress(employeevm.getEmployee_address_id()));
            newEntity = repository.save(newEntity);
             
           
            return newEntity; 
        }
    }
     
    public void deleteEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<EmployeeEntity> employee = repository.findById(id);
         
        if(employee.isPresent())
        {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
        
        
    }
}