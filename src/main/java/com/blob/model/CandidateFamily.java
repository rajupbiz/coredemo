package com.blob.model;

import java.sql.Date;

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
	
	@Column(name="about_family")
	private String aboutFamily;

	@Column(name="father_first_name")
	private String fatherFirstName;
	
	@Column(name="father_last_name")
	private String fatherLastName;
	
	@Column(name="fathers_occupation")
	private String fathersOccupation;
	
	@Column(name="fathers_yearly_income")
	private double fathersYearlyIncome;
	
	@Column(name="mother_first_name")
	private String motherFirstName;
	
	@Column(name="mothers_occupation")
	private String mothersOccupation;
	
	@Column(name="mothers_yearly_income")
	private double mothersYearlyIncome;
	
	@Column(name="native_place")
	private String nativePlace;
	
	@Column(name="no_of_brother")
	private int noOfBrother;
	
	@Column(name="no_of_sister")
	private int noOfSister;
	
	@Column(name="no_of_married_brother")
	private int noOfMarriedBrother;
	
	@Column(name="no_of_married_sister")
	private int noOfMarriedSister;
	
	@Column(name="intercast_in_family")
	private boolean intercastInFamily;
	
	@Column(name="intercast_detail")
	private String intercastDetail;
	
	@Column(name="family_wealth")
	private String familyWealth;
	
	@Column(name="mamas_first_name")
	private String mamasFirstName;
	
	@Column(name="mamas_last_name")
	private String mamasLastName;
	
	@Column(name="mamas_native_place")
	private String mamasNativePlace;
	
	@Column(name="relatives")
	private String relatives;
	
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

	public String getFathersOccupation() {
		return fathersOccupation;
	}

	public void setFathersOccupation(String fathersOccupation) {
		this.fathersOccupation = fathersOccupation;
	}

	public double getFathersYearlyIncome() {
		return fathersYearlyIncome;
	}

	public void setFathersYearlyIncome(double fathersYearlyIncome) {
		this.fathersYearlyIncome = fathersYearlyIncome;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public String getMothersOccupation() {
		return mothersOccupation;
	}

	public void setMothersOccupation(String mothersOccupation) {
		this.mothersOccupation = mothersOccupation;
	}

	public double getMothersYearlyIncome() {
		return mothersYearlyIncome;
	}

	public void setMothersYearlyIncome(double mothersYearlyIncome) {
		this.mothersYearlyIncome = mothersYearlyIncome;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public int getNoOfBrother() {
		return noOfBrother;
	}

	public void setNoOfBrother(int noOfBrother) {
		this.noOfBrother = noOfBrother;
	}

	public int getNoOfSister() {
		return noOfSister;
	}

	public void setNoOfSister(int noOfSister) {
		this.noOfSister = noOfSister;
	}

	public int getNoOfMarriedBrother() {
		return noOfMarriedBrother;
	}

	public void setNoOfMarriedBrother(int noOfMarriedBrother) {
		this.noOfMarriedBrother = noOfMarriedBrother;
	}

	public int getNoOfMarriedSister() {
		return noOfMarriedSister;
	}

	public void setNoOfMarriedSister(int noOfMarriedSister) {
		this.noOfMarriedSister = noOfMarriedSister;
	}

	public boolean isIntercastInFamily() {
		return intercastInFamily;
	}

	public void setIntercastInFamily(boolean intercastInFamily) {
		this.intercastInFamily = intercastInFamily;
	}

	public String getIntercastDetail() {
		return intercastDetail;
	}

	public void setIntercastDetail(String intercastDetail) {
		this.intercastDetail = intercastDetail;
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

	
	
}
