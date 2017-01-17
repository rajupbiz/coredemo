package com.blob.model.ui;

public class ProfileSummary {

	private String id;
	private String gid;
	private String fullName;
	private String dob;
	private String fathersFullName;
	private String currentLocation;
	private String homeTown;
	private String mamasTown;
	private String occupation;
	private String education;
	private String about;
	private String gender;
	private String primaryPicPath;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFathersFullName() {
		return fathersFullName;
	}
	public void setFathersFullName(String fathersFullName) {
		this.fathersFullName = fathersFullName;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getMamasTown() {
		return mamasTown;
	}
	public void setMamasTown(String mamasTown) {
		this.mamasTown = mamasTown;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "ProfileSummary [id=" + id + ", gid=" + gid + ", fullName=" + fullName + ", dob=" + dob + ", fathersFullName="
				+ fathersFullName + ", currentLocation=" + currentLocation + ", homeTown=" + homeTown + ", mamasTown="
				+ mamasTown + ", occupation=" + occupation + ", education=" + education + ", about=" + about + ", primaryPicPath=" +primaryPicPath+ " ]";
	}
	public String getPrimaryPicPath() {
		return primaryPicPath;
	}
	public void setPrimaryPicPath(String primaryPicPath) {
		this.primaryPicPath = primaryPicPath;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
