package com.blob.model.user;

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
@Table(name="user_personal")
public class UserPersonal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;

	/*@Embedded
	private Person person;*/
	
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="about_me")
	private String aboutMe;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="height")
	private Integer height;
	
	@Column(name="weight")
	private Integer weight;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@Column(name="hobby")
	private String hobby;
	
	@Column(name="handicaped")
	private boolean handicaped;
	
	@Column(name="handicap_detail")
	private String handicapDetail;
	
	@Column(name="create_on")
	private Date createOn;
	
	/*@Column(name="update_user")
	private Long updateUser;*/
	
	@Column(name="update_on")
	private Date updateOn;
	
	/*@ManyToOne
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
	private MasterFoodType foodType;*/
	
	
	
	/*@Column(name="nativePlace")
	private String nativePlace;*/
	
	/*@ManyToOne
	@JoinColumn(name="smoker_type_id")
	private MasterSmokerType smokerType;
	
	@ManyToOne
	@JoinColumn(name="drinker_type_id")
	private MasterDrinkerType drinkerType;*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
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
}
