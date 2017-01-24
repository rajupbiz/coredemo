package com.blob.model.ui;

import java.util.List;

public class DashboardInfo {

	private String gid;
	private String lastSignedIn;
	private String lastProfileUpdated;
	private String profileCompletion;
	private String profilePrivacyLevel;
	private Integer noOfProfileViews;
	private Boolean isProfileNotCreated;
	private Integer noOfUnreadMessages;
	private String firstName;
	private String fullName;
	private String dateOfBirth;
	private String occupation;
	private String education;
	private String address;
	private String currentLocation;
	private String contact;
	private String height;
	private String heightFoot;
	private String weight;
	private List<ShortlistedProfile> shortlistedProfiles;
	private List<Message> messages;
	//private String primaryPicPath;
	private PhotoInfo photoInfo;
	
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getLastSignedIn() {
		return lastSignedIn;
	}
	public void setLastSignedIn(String lastSignedIn) {
		this.lastSignedIn = lastSignedIn;
	}
	public String getLastProfileUpdated() {
		return lastProfileUpdated;
	}
	public void setLastProfileUpdated(String lastProfileUpdated) {
		this.lastProfileUpdated = lastProfileUpdated;
	}
	public String getProfileCompletion() {
		return profileCompletion;
	}
	public void setProfileCompletion(String profileCompletion) {
		this.profileCompletion = profileCompletion;
	}
	public String getProfilePrivacyLevel() {
		return profilePrivacyLevel;
	}
	public void setProfilePrivacyLevel(String profilePrivacyLevel) {
		this.profilePrivacyLevel = profilePrivacyLevel;
	}
	public Integer getNoOfProfileViews() {
		return noOfProfileViews;
	}
	public void setNoOfProfileViews(Integer noOfProfileViews) {
		this.noOfProfileViews = noOfProfileViews;
	}
	public Boolean getIsProfileNotCreated() {
		return isProfileNotCreated;
	}
	public void setIsProfileNotCreated(Boolean isProfileNotCreated) {
		this.isProfileNotCreated = isProfileNotCreated;
	}
	public Integer getNoOfUnreadMessages() {
		return noOfUnreadMessages;
	}
	public void setNoOfUnreadMessages(Integer noOfUnreadMessages) {
		this.noOfUnreadMessages = noOfUnreadMessages;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeightFoot() {
		return heightFoot;
	}
	public void setHeightFoot(String heightFoot) {
		this.heightFoot = heightFoot;
	}
	public List<ShortlistedProfile> getShortlistedProfiles() {
		return shortlistedProfiles;
	}
	public void setShortlistedProfiles(List<ShortlistedProfile> shortlistedProfiles) {
		this.shortlistedProfiles = shortlistedProfiles;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public PhotoInfo getPhotoInfo() {
		return photoInfo;
	}
	public void setPhotoInfo(PhotoInfo photoInfo) {
		this.photoInfo = photoInfo;
	} 
}
