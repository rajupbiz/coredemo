package com.blob.model.candidate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="candidate_family")
public class CandidateFamily {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@Column(name="father_first_name")
	private String fatherFirstName;
	
	@Column(name="father_middle_name")
	private String fatherMiddleName;
	
	@Column(name="father_last_name")
	private String fatherLastName;
	
	@Column(name="mother_first_name")
	private String motherFirstName;
	
	@Column(name="no_of_brother")
	private Integer noOfBrother;
	
	@Column(name="no_of_sister")
	private Integer noOfSister;
	
	@Column(name="no_of_married_brother")
	private Integer noOfMarriedBrother;
	
	@Column(name="no_of_married_sister")
	private Integer noOfMarriedSister;
	
	@Column(name="family_occupation")
	private String familyOccupation;
	
	@Column(name="family_wealth")
	private String familyWealth;
	
	@Column(name="mamas_first_name")
	private String mamasFirstName;
	
	@Column(name="mamas_middle_name")
	private String mamasMiddleName;
	
	@Column(name="mamas_last_name")
	private String mamasLastName;
	
	@Column(name="mamas_native_place")
	private String mamasNativePlace;
	
	@Column(name="mamas_current_place")
	private String mamasCurrentPlace;
	
	@Column(name="relatives")
	private String relatives;
	
	@Column(name="about_family")
	private String aboutFamily;
	
	@Column(name="create_user")
	private Long createUser;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_user")
	private Long updateUser;
	
	@Column(name="update_on")
	private Date updateOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAboutFamily() {
		return aboutFamily;
	}

	public void setAboutFamily(String aboutFamily) {
		this.aboutFamily = aboutFamily;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public String getFamilyWealth() {
		return familyWealth;
	}

	public void setFamilyWealth(String familyWealth) {
		this.familyWealth = familyWealth;
	}

	public String getMamasFirstName() {
		return mamasFirstName;
	}

	public void setMamasFirstName(String mamasFirstName) {
		this.mamasFirstName = mamasFirstName;
	}

	public String getMamasLastName() {
		return mamasLastName;
	}

	public void setMamasLastName(String mamasLastName) {
		this.mamasLastName = mamasLastName;
	}

	public String getMamasNativePlace() {
		return mamasNativePlace;
	}

	public void setMamasNativePlace(String mamasNativePlace) {
		this.mamasNativePlace = mamasNativePlace;
	}

	public String getRelatives() {
		return relatives;
	}

	public void setRelatives(String relatives) {
		this.relatives = relatives;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getFamilyOccupation() {
		return familyOccupation;
	}

	public void setFamilyOccupation(String familyOccupation) {
		this.familyOccupation = familyOccupation;
	}

	public String getMamasMiddleName() {
		return mamasMiddleName;
	}

	public void setMamasMiddleName(String mamasMiddleName) {
		this.mamasMiddleName = mamasMiddleName;
	}

	public String getMamasCurrentPlace() {
		return mamasCurrentPlace;
	}

	public void setMamasCurrentPlace(String mamasCurrentPlace) {
		this.mamasCurrentPlace = mamasCurrentPlace;
	}

	public Integer getNoOfBrother() {
		return noOfBrother;
	}

	public void setNoOfBrother(Integer noOfBrother) {
		this.noOfBrother = noOfBrother;
	}

	public Integer getNoOfSister() {
		return noOfSister;
	}

	public void setNoOfSister(Integer noOfSister) {
		this.noOfSister = noOfSister;
	}

	public Integer getNoOfMarriedBrother() {
		return noOfMarriedBrother;
	}

	public void setNoOfMarriedBrother(Integer noOfMarriedBrother) {
		this.noOfMarriedBrother = noOfMarriedBrother;
	}

	public Integer getNoOfMarriedSister() {
		return noOfMarriedSister;
	}

	public void setNoOfMarriedSister(Integer noOfMarriedSister) {
		this.noOfMarriedSister = noOfMarriedSister;
	}

	
	
}
