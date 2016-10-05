package com.blob.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="master_yearly_income")
public class MasterYearlyIncome {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="yearly_income")
	private String yearlyIncome;
	
	@Column(name="yearly_income_desc")
	private String yearlyIncomeDesc;
	
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
	public String getYearlyIncome() {
		return yearlyIncome;
	}
	public void setYearlyIncome(String yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	public String getYearlyIncomeDesc() {
		return yearlyIncomeDesc;
	}
	public void setYearlyIncomeDesc(String yearlyIncomeDesc) {
		this.yearlyIncomeDesc = yearlyIncomeDesc;
	}
}
