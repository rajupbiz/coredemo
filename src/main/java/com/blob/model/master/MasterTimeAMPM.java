package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_time_AMPM")
public class MasterTimeAMPM {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="time_AMPM")
	private String timeAMPM;
	
	@Column(name="time_AMPM_desc")
	private String timeAMPMDesc;
	
	@Column(name="sequence_number")
	private int sequenceNumber;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeAMPM() {
		return timeAMPM;
	}

	public void setTimeAMPM(String timeAMPM) {
		this.timeAMPM = timeAMPM;
	}

	public String getTimeAMPMDesc() {
		return timeAMPMDesc;
	}

	public void setTimeAMPMDesc(String timeAMPMDesc) {
		this.timeAMPMDesc = timeAMPMDesc;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	
	
	
	
}
