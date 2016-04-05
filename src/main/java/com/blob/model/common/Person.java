package com.blob.model.common;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.blob.model.master.MasterBloodGroup;
import com.blob.model.master.MasterBodyType;
import com.blob.model.master.MasterDrinkerType;
import com.blob.model.master.MasterFoodType;
import com.blob.model.master.MasterGender;
import com.blob.model.master.MasterMaritalStatus;
import com.blob.model.master.MasterMarriageType;
import com.blob.model.master.MasterMotherTongue;
import com.blob.model.master.MasterReligion;
import com.blob.model.master.MasterSmokerType;

//@Entity
//@Table(name="person")
@Embeddable
public class Person {
	
	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;*/

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="about_me")
	private String aboutMe;
	
	@ManyToOne
	@JoinColumn(name="gender_id")
	private MasterGender gender;
	
	@Column(name="height")
	private float height;
	
	@Column(name="weight")
	private float weight;
	
	@ManyToOne
	@JoinColumn(name="blood_group_id")
	private MasterBloodGroup bloodGroup;
	
	@ManyToOne
	@JoinColumn(name="marital_status_id")
	private MasterMaritalStatus maritalStatus;
	
	@ManyToOne
	@JoinColumn(name="marriage_type_id")
	private MasterMarriageType marriageType;
	
	@ManyToOne
	@JoinColumn(name="religion_id")
	private MasterReligion religion;
	
	@ManyToOne
	@JoinColumn(name="mother_tongue_id")
	private MasterMotherTongue motherTongue;
	
	@Column(name="caste")
	private String caste;
	
	@Column(name="gotra")
	private String gotra;
	
	@Column(name="devak")
	private String devak;
	
	@Column(name="complextion")
	private String complextion;
	
	@Column(name="personality")
	private String personality;
	
	@Column(name="specs")
	private String specs;
	
	@Column(name="lens")
	private String lens;
	
	@ManyToOne
	@JoinColumn(name="body_type_id")
	private MasterBodyType bodyType;
	
	@ManyToOne
	@JoinColumn(name="food_type_id")
	private MasterFoodType foodType;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="handicaped")
	private boolean handicaped;
	
	@Column(name="handicap_detail")
	private String handicapDetail;
	
	@ManyToOne
	@JoinColumn(name="smoker_type_id")
	private MasterSmokerType smokerType;
	
	@ManyToOne
	@JoinColumn(name="drinker_type_id")
	private MasterDrinkerType drinkerType;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_user")
	private Long updateUser;
	
	@Column(name="update_on")
	private Date updateOn;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public MasterGender getGender() {
		return gender;
	}

	public void setGender(MasterGender gender) {
		this.gender = gender;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public MasterBloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(MasterBloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public MasterMaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MasterMaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public MasterMarriageType getMarriageType() {
		return marriageType;
	}

	public void setMarriageType(MasterMarriageType marriageType) {
		this.marriageType = marriageType;
	}

	public MasterReligion getReligion() {
		return religion;
	}

	public void setReligion(MasterReligion religion) {
		this.religion = religion;
	}

	public MasterMotherTongue getMotherTongue() {
		return motherTongue;
	}

	public void setMotherTongue(MasterMotherTongue motherTongue) {
		this.motherTongue = motherTongue;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getGotra() {
		return gotra;
	}

	public void setGotra(String gotra) {
		this.gotra = gotra;
	}

	public String getDevak() {
		return devak;
	}

	public void setDevak(String devak) {
		this.devak = devak;
	}

	public String getComplextion() {
		return complextion;
	}

	public void setComplextion(String complextion) {
		this.complextion = complextion;
	}

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getSpecs() {
		return specs;
	}

	public void setSpecs(String specs) {
		this.specs = specs;
	}

	public String getLens() {
		return lens;
	}

	public void setLens(String lens) {
		this.lens = lens;
	}

	public MasterBodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(MasterBodyType bodyType) {
		this.bodyType = bodyType;
	}

	public MasterFoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(MasterFoodType foodType) {
		this.foodType = foodType;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public boolean isHandicaped() {
		return handicaped;
	}

	public void setHandicaped(boolean handicaped) {
		this.handicaped = handicaped;
	}

	public String getHandicapDetail() {
		return handicapDetail;
	}

	public void setHandicapDetail(String handicapDetail) {
		this.handicapDetail = handicapDetail;
	}

	public MasterSmokerType getSmokerType() {
		return smokerType;
	}

	public void setSmokerType(MasterSmokerType smokerType) {
		this.smokerType = smokerType;
	}

	public MasterDrinkerType getDrinkerType() {
		return drinkerType;
	}

	public void setDrinkerType(MasterDrinkerType drinkerType) {
		this.drinkerType = drinkerType;
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
