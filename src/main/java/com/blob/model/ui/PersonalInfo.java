package com.blob.model.ui;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.blob.model.master.MasterBloodGroup;
import com.blob.model.master.MasterDayOfWeek;
import com.blob.model.master.MasterMaritalStatus;

public class PersonalInfo {

	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	private String gender;
	private Long genderId;
	private String maritalStatus;
	private Long maritalStatusId;
	private Integer heightCms;
	private String heightFoot;
	private Integer weight;
	private String birthName;
	private String birthPlace;
	private String birthDate;
	private String birthTime;
	private String birthDay;
	private Long birthDayId;
	private String bloodGroup;
	private Long bloodGroupId;
	private String hobby;
	private String aboutMe;
	private String isMangal;
	private List<MasterMaritalStatus> maritalStatusOptions;
	private List<MasterDayOfWeek> birthDayOptions;
	private List<MasterBloodGroup> bloodGroupOptions;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getBirthName() {
		return birthName;
	}
	public void setBirthName(String birthName) {
		this.birthName = birthName;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthTime() {
		return birthTime;
	}
	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getIsMangal() {
		return isMangal;
	}
	public void setIsMangal(String isMangal) {
		this.isMangal = isMangal;
	}
	public Long getBloodGroupId() {
		return bloodGroupId;
	}
	public void setBloodGroupId(Long bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}
	public Long getGenderId() {
		return genderId;
	}
	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}
	public Long getMaritalStatusId() {
		return maritalStatusId;
	}
	public void setMaritalStatusId(Long maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}
	public Integer getHeightCms() {
		return heightCms;
	}
	public void setHeightCms(Integer heightCms) {
		this.heightCms = heightCms;
	}
	public String getHeightFoot() {
		return heightFoot;
	}
	public void setHeightFoot(String heightFoot) {
		this.heightFoot = heightFoot;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Long getBirthDayId() {
		return birthDayId;
	}
	public void setBirthDayId(Long birthDayId) {
		this.birthDayId = birthDayId;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public List<MasterMaritalStatus> getMaritalStatusOptions() {
		return maritalStatusOptions;
	}
	public void setMaritalStatusOptions(List<MasterMaritalStatus> maritalStatusOptions) {
		this.maritalStatusOptions = maritalStatusOptions;
	}
	public List<MasterDayOfWeek> getBirthDayOptions() {
		return birthDayOptions;
	}
	public void setBirthDayOptions(List<MasterDayOfWeek> birthDayOptions) {
		this.birthDayOptions = birthDayOptions;
	}
	public List<MasterBloodGroup> getBloodGroupOptions() {
		return bloodGroupOptions;
	}
	public void setBloodGroupOptions(List<MasterBloodGroup> bloodGroupOptions) {
		this.bloodGroupOptions = bloodGroupOptions;
	}
	public String getFullName() {
		
		StringBuffer fullNameStr = new StringBuffer();
		fullNameStr.append(firstName);
		if(StringUtils.isNotBlank(middleName)){
			fullNameStr.append(" "+middleName);
		}
		if(StringUtils.isNotBlank(lastName)){
			fullNameStr.append(" "+lastName);
		}
		return fullNameStr.toString();
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
