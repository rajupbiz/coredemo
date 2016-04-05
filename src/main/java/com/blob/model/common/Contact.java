package com.blob.model.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.blob.model.master.MasterCommunication;

//@Entity
//@Table(name="contact")
@Embeddable
public class Contact {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;

	@Column(name="email")
	private String email;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="landline_phone")
	private String landlinePhone;
	
	@OneToOne
	@JoinColumn(name="preferred_communication_id")
	private MasterCommunication preferredCommunication;

	@Column(name="skype_id")
	private String skypeID;
	
	@Column(name="linked_in_profile_id")
	private String linkedInProfileID;
	
	@Column(name="facebook_profile_id")
	private String facebookProfileID;
	
	@Column(name="website_or_blog_id")
	private String websiteOrBlogID;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLandlinePhone() {
		return landlinePhone;
	}

	public void setLandlinePhone(String landlinePhone) {
		this.landlinePhone = landlinePhone;
	}

	public MasterCommunication getPreferredCommunication() {
		return preferredCommunication;
	}

	public void setPreferredCommunication(MasterCommunication preferredCommunication) {
		this.preferredCommunication = preferredCommunication;
	}

	public String getSkypeID() {
		return skypeID;
	}

	public void setSkypeID(String skypeID) {
		this.skypeID = skypeID;
	}

	public String getLinkedInProfileID() {
		return linkedInProfileID;
	}

	public void setLinkedInProfileID(String linkedInProfileID) {
		this.linkedInProfileID = linkedInProfileID;
	}

	public String getFacebookProfileID() {
		return facebookProfileID;
	}

	public void setFacebookProfileID(String facebookProfileID) {
		this.facebookProfileID = facebookProfileID;
	}

	public String getWebsiteOrBlogID() {
		return websiteOrBlogID;
	}

	public void setWebsiteOrBlogID(String websiteOrBlogID) {
		this.websiteOrBlogID = websiteOrBlogID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
