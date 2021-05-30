package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_address")
public class EmployeeAddressEntity {
	
	
	@Id
    @GeneratedValue
    private Long id;
     
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPin() {
		return pin;
	}

	public void setPin(Long pin) {
		this.pin = pin;
	}

	@Column(name="addressline1")
    private String addressline1;
     
    @Column(name="addressline2")
    private String addressline2;
     
    @Column(name="state")
    private String state;
     
    @Column(name="city")
    private String city;
    
    @Column(name="pin")
    private Long pin;
    
    //Setters and getters
 
    @Override
    public String toString() {
        return "EmployeeEntity [id=" + id + ", addressline1=" + addressline1 + 
               ", addressline2=" + addressline2 + ", state=" + state   + 
                ",city" + city +  ",pin" + pin + "]";

    }
}
    