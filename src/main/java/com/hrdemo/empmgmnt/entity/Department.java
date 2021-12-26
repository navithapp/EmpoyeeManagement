package com.hrdemo.empmgmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "department")
public class Department extends BaseEntity {

	@Column(name = "dept_name")
	private String departmentName;
	
	@Column(name = "dept_code")
	private String departmentCode;
	
	
	@Column(name = "dept_description")
	private String deptDescription;


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getDepartmentCode() {
		return departmentCode;
	}


	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}


	public String getDeptDescription() {
		return deptDescription;
	}


	public void setDeptDescription(String deptDescription) {
		this.deptDescription = deptDescription;
	}

}
