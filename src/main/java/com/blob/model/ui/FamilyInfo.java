package com.blob.model.ui;

import org.apache.commons.lang3.StringUtils;

public class FamilyInfo {

	private String fatherFirstName;
	private String fatherMiddleName;
	private String fatherLastName;
	@SuppressWarnings("unused")
	private String fatherFullName;
	private String motherFirstName;
	private Integer noOfBrother;
	private Integer noOfSister;
	private Integer noOfMarriedBrother;
	private Integer noOfMarriedSister;
	private String familyOccupation;
	private String familyWealth;
	private String aboutFamily;
	private String mamasFirstName;
	private String mamasMiddleName;
	private String mamasLastName;
	@SuppressWarnings("unused")
	private String mamasName;
	private String mamasNativePlace;
	private String mamasCurrentPlace;
	
	public String getFatherFirstName() {
		return fatherFirstName;
	}
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}
	public String getFatherMiddleName() {
		return fatherMiddleName;
	}
	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
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
	public String getFamilyOccupation() {
		return familyOccupation;
	}
	public void setFamilyOccupation(String familyOccupation) {
		this.familyOccupation = familyOccupation;
	}
	public String getFamilyWealth() {
		return familyWealth;
	}
	public void setFamilyWealth(String familyWealth) {
		this.familyWealth = familyWealth;
	}
	public String getAboutFamily() {
		return aboutFamily;
	}
	public void setAboutFamily(String aboutFamily) {
		this.aboutFamily = aboutFamily;
	}
	public String getMamasFirstName() {
		return mamasFirstName;
	}
	public void setMamasFirstName(String mamasFirstName) {
		this.mamasFirstName = mamasFirstName;
	}
	public String getMamasMiddleName() {
		return mamasMiddleName;
	}
	public void setMamasMiddleName(String mamasMiddleName) {
		this.mamasMiddleName = mamasMiddleName;
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
	public String getFatherFullName() {
		StringBuffer fullNameStr = new StringBuffer();
		fullNameStr.append(fatherFirstName);
		if(StringUtils.isNotBlank(fatherMiddleName)){
			fullNameStr.append(" "+fatherMiddleName);
		}
		if(StringUtils.isNotBlank(fatherLastName)){
			fullNameStr.append(" "+fatherLastName);
		}
		return fullNameStr.toString();
	}
	public void setFatherFullName(String fatherFullName) {
		this.fatherFullName = fatherFullName;
	}
	public String getMamasName() {
		StringBuffer fullNameStr = new StringBuffer();
		fullNameStr.append(mamasFirstName);
		if(StringUtils.isNotBlank(mamasMiddleName)){
			fullNameStr.append(" "+mamasMiddleName);
		}
		if(StringUtils.isNotBlank(mamasLastName)){
			fullNameStr.append(" "+mamasLastName);
		}
		return fullNameStr.toString();
	}
	public void setMamasName(String mamasName) {
		this.mamasName = mamasName;
	}
}
