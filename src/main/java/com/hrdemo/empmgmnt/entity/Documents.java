package com.hrdemo.empmgmnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "documents")
public class Documents extends BaseEntity {

	@Column(name = "doc_type")
	private Integer documentType;
	
	@Column(name = "doc_name")
	private String documentName;
	
//	@Column(name = "document")
//	private String document;
//	
	@OneToOne
	@JoinColumn(name = "doc_status")
	private Status status;

	public Integer getDocumentType() {
		return documentType;
	}

	public void setDocumentType(Integer documentType) {
		this.documentType = documentType;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
