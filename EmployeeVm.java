package com.howtodoinjava.demo.vm;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.howtodoinjava.demo.model.EmployeeAddressEntity;

public class EmployeeVm {
	

 
    private Long id;
    
    private String firstName;
     
    private String lastName;
    
    private String email;
    
    public EmployeeAddressEntity getEmployee_address_id() {
		return employee_address_id;
	}

	public void setEmployee_address_id(EmployeeAddressEntity employee_address_id) {
		this.employee_address_id = employee_address_id;
	}

	private EmployeeAddressEntity employee_address_id;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

 
}
