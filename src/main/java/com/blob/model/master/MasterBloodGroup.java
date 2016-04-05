package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_blood_group")
public class MasterBloodGroup {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="blood_group_name")
	private String bloodGroupName;
	
	@Column(name="blood_group_desc")
	private String bloodGroupDesc;
	
	@Column(name="sequence_number")
	private int sequenceNumber;
	
	@Column(name="status")
	private Character status;
	
	@Column(name="create_on")
	private Date createOn;

	
	
	
	
}
