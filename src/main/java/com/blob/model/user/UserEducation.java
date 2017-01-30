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

import com.blob.model.master.MasterDegree;
import com.blob.model.master.MasterDegreeSpecialization;

@Entity
@Table(name="user_education")
public class UserEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name="degree_id")
	private MasterDegree degree;
	
	@OneToOne
	@JoinColumn(name="specialization_id")
	private MasterDegreeSpecialization specialization;
	
	@Column(name="other_degree")
	private String otherDegree;
	
	@Column(name="other_specialization")
	private String otherSpecialization;
	
	@Column(name="education_note")
	private String educationNote;
	
	@Column(name="is_highest")
	private boolean isHighest;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_on")
	private Date updateOn;
	
	@Column(name="sequence_number")
	private Integer sequenceNumber;
	
	@Transient
	private Long degreeId;
	
	@Transient
	private Long specializationId;
	
	@Transient
	private String degreeStr;
	
	@Transient
	private String specializationStr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEducationNote() {
		return educationNote;
	}

	public void setEducationNote(String educationNote) {
		this.educationNote = educationNote;
	}

	public boolean isHighest() {
		return isHighest;
	}

	public void setHighest(boolean isHighest) {
		this.isHighest = isHighest;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*public String getDegreeStr() {
		return degreeStr;
	}

	public void setDegreeStr(String degreeStr) {
		this.degreeStr = degreeStr;
	}

	public String getSpecializationStr() {
		return specializationStr;
	}

	public void setSpecializationStr(String specializationStr) {
		this.specializationStr = specializationStr;
	}*/

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MasterDegree getDegree() {
		return degree;
	}

	public void setDegree(MasterDegree degree) {
		this.degree = degree;
	}

	public MasterDegreeSpecialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(MasterDegreeSpecialization specialization) {
		this.specialization = specialization;
	}

	public String getOtherDegree() {
		return otherDegree;
	}

	public void setOtherDegree(String otherDegree) {
		this.otherDegree = otherDegree;
	}

	public String getOtherSpecialization() {
		return otherSpecialization;
	}

	public void setOtherSpecialization(String otherSpecialization) {
		this.otherSpecialization = otherSpecialization;
	}

	public Long getDegreeId() {
		return degreeId;
	}

	public void setDegreeId(Long degreeId) {
		this.degreeId = degreeId;
	}

	public Long getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(Long specializationId) {
		this.specializationId = specializationId;
	}

	public String getDegreeStr() {
		return degreeStr;
	}

	public void setDegreeStr(String degreeStr) {
		this.degreeStr = degreeStr;
	}

	public String getSpecializationStr() {
		return specializationStr;
	}

	public void setSpecializationStr(String specializationStr) {
		this.specializationStr = specializationStr;
	}
}
