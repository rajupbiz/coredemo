package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_drinker_type")
public class MasterDrinkerType {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="drinker_type")
	private String drinkerType;
	
	@Column(name="drinker_type_desc")
	private String drinkerTypeDesc;
	
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

	public String getDrinkerType() {
		return drinkerType;
	}

	public void setDrinkerType(String drinkerType) {
		this.drinkerType = drinkerType;
	}

	public String getDrinkerTypeDesc() {
		return drinkerTypeDesc;
	}

	public void setDrinkerTypeDesc(String drinkerTypeDesc) {
		this.drinkerTypeDesc = drinkerTypeDesc;
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
