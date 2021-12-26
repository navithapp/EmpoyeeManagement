package com.hrdemo.empmgmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "roles")
public class Roles extends BaseEntity {

	@Column(name = "code")
	private String code;
	
	@Column(name = "role_name")
	private String roleName;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
