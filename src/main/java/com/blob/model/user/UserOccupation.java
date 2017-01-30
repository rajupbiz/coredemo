package com.blob.model.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.blob.model.master.MasterDesignation;
import com.blob.model.master.MasterOccupation;
import com.blob.model.master.MasterYearlyIncome;

@Entity
@Table(name="user_occupation")
public class UserOccupation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="occupation_id")
	private MasterOccupation occupation;
	
	@OneToOne
	@JoinColumn(name="designation_id")
	private MasterDesignation designation;
	
	@OneToOne
	@JoinColumn(name="yearly_income_id")
	private MasterYearlyIncome yearlyIncome;
	
	@Column(name="other_occupation")
	private String otherOccupation;
	
	@Column(name="other_designation")
	private String otherDesignation;
	
	/*@Column(name="occupation")
	private String occupation;
	
	@Column(name="designation")
	private String designation;*/
	
/*	@Column(name="yearlyIncome")
	private Double yearlyIncome;*/
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;
	
	/*@Column(name="update_user")
	private Long updateUser;*/
	
	@Column(name="update_on")
	private Date updateOn;
	
	@Column(name="description")
	private String description;
	
	@Column(name="sequence_number")
	private Integer sequenceNumber;
	
	/*@OneToOne
	@JoinColumn(name="occupation_id")
	private MasterOccupation occupation;*/
	
	/*@OneToOne
	@JoinColumn(name="designation_id")
	private MasterDesignation designation;
	
	@OneToOne
	@JoinColumn(name="yearly_income_id")
	private MasterYearlyIncome yearlyIncome;*/
	
	/*@Column(name="occupation_note")
	private String occupationNote;*/
	
	@Transient
	private Long occupationId;
	
	@Transient
	private Long designationId;
	
	@Transient
	private Long yearlyIncomeId;
	
	@Transient
	private String occupationStr;
	
	@Transient
	private String designationStr;
	
	@Transient
	private String yearlyIncomeStr;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	/*public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}*/

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public MasterOccupation getOccupation() {
		return occupation;
	}

	public void setOccupation(MasterOccupation occupation) {
		this.occupation = occupation;
	}

	public MasterDesignation getDesignation() {
		return designation;
	}

	public void setDesignation(MasterDesignation designation) {
		this.designation = designation;
	}

	public MasterYearlyIncome getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(MasterYearlyIncome yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	public String getOtherOccupation() {
		return otherOccupation;
	}

	public void setOtherOccupation(String otherOccupation) {
		this.otherOccupation = otherOccupation;
	}

	public String getOtherDesignation() {
		return otherDesignation;
	}

	public void setOtherDesignation(String otherDesignation) {
		this.otherDesignation = otherDesignation;
	}

	public Long getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Long occupationId) {
		this.occupationId = occupationId;
	}

	public Long getDesignationId() {
		return designationId;
	}

	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}

	public Long getYearlyIncomeId() {
		return yearlyIncomeId;
	}

	public void setYearlyIncomeId(Long yearlyIncomeId) {
		this.yearlyIncomeId = yearlyIncomeId;
	}

	public String getOccupationStr() {
		return occupationStr;
	}

	public void setOccupationStr(String occupationStr) {
		this.occupationStr = occupationStr;
	}

	public String getDesignationStr() {
		return designationStr;
	}

	public void setDesignationStr(String designationStr) {
		this.designationStr = designationStr;
	}

	public String getYearlyIncomeStr() {
		return yearlyIncomeStr;
	}

	public void setYearlyIncomeStr(String yearlyIncomeStr) {
		this.yearlyIncomeStr = yearlyIncomeStr;
	}
}
