package com.hrdemo.empmgmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "login_details")
public class LoginDetails extends BaseEntity {

	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;
	
	@Column(name = "temp")
	private boolean temp;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public boolean isTemp() {
		return temp;
	}

	public void setTemp(boolean temp) {
		this.temp = temp;
	}
}
