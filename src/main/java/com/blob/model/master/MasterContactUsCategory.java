package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_contact_us_category")
public class MasterContactUsCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="contact_us_category")
	private String contactUsCategory;
	
	@Column(name="contact_usCategoryDesc")
	private String contactUsCategoryDesc;
	
	@Column(name="sequence_number")
	private int sequenceNumber;
	
	@Column(name="status")
	private Character status;
	
	@Column(name="create_on")
	private Date createOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContactUsCategory() {
		return contactUsCategory;
	}

	public void setContactUsCategory(String contactUsCategory) {
		this.contactUsCategory = contactUsCategory;
	}

	public String getContactUsCategoryDesc() {
		return contactUsCategoryDesc;
	}

	public void setContactUsCategoryDesc(String contactUsCategoryDesc) {
		this.contactUsCategoryDesc = contactUsCategoryDesc;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	
	
	
	
}
