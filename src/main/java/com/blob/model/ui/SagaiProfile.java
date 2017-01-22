package com.blob.model.ui;

public class SagaiProfile {
	
	private Long id;
	private String gid;
	private String primaryPicPath;
	private PersonalInfo personalInfo;
	private FamilyInfo familyInfo;
	private ContactInfo contactInfo;
	private EduOccuInfo eduOccInfo;
	private PhotoInfo photos;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public FamilyInfo getFamilyInfo() {
		return familyInfo;
	}
	public void setFamilyInfo(FamilyInfo familyInfo) {
		this.familyInfo = familyInfo;
	}
	public PhotoInfo getPhotos() {
		return photos;
	}
	public void setPhotos(PhotoInfo photos) {
		this.photos = photos;
	}
	public EduOccuInfo getEduOccInfo() {
		return eduOccInfo;
	}
	public void setEduOccInfo(EduOccuInfo eduOccInfo) {
		this.eduOccInfo = eduOccInfo;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getPrimaryPicPath() {
		return primaryPicPath;
	}
	public void setPrimaryPicPath(String primaryPicPath) {
		this.primaryPicPath = primaryPicPath;
	}
}
