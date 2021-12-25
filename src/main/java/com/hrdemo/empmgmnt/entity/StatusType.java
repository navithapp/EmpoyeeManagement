package com.hrdemo.empmgmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "status_types")
public class StatusType extends BaseEntity {

	@Column(name = "code")
	private String code;
	
	@Column(name = "description")
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
