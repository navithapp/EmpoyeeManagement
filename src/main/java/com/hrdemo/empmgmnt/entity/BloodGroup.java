package com.hrdemo.empmgmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "blood_groups")
public class BloodGroup extends BaseEntity {

	@Column(name = "blood_group")
	private String bloodGroup;

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
}
