package com.springboot.Springbootcurdrestfulwebservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
       private long id;
	@Column(name = "first_name")
       private long firstName;
	@Column(name = "last_name")
       private long lastName;
	@Column(name = "email_id")
       private long emailId;
       
       
       
       
	public Employee() {
		super();
	}
	public Employee(long id, long firstName, long lastName, long emailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFirstName() {
		return firstName;
	}
	public void setFirstName(long firstName) {
		this.firstName = firstName;
	}
	public long getLastName() {
		return lastName;
	}
	public void setLastName(long lastName) {
		this.lastName = lastName;
	}
	public long getEmailId() {
		return emailId;
	}
	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
       
       
   
}


