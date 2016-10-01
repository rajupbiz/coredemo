package com.blob.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.blob.model.master.MasterCommunication;
import com.blob.model.master.MasterRelationship;

@Entity
@Table(name="candidate_contact")
public class CandidateContact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="full_name")
	private String fullName;

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
	
	@OneToOne
	@JoinColumn(name="relationship_id")
	private MasterRelationship relationship;

	@Column(name="is_primary_contact")
	private boolean isPrimaryContact;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_user")
	private Long createUser;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_user")
	private Long updateUser;
	
	@Column(name="update_on")
	private Date updateOn;

	@Transient
	private Long relationshipId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public MasterRelationship getRelationship() {
		return relationship;
	}

	public void setRelationship(MasterRelationship relationship) {
		this.relationship = relationship;
	}

	public boolean isPrimaryContact() {
		return isPrimaryContact;
	}

	public void setPrimaryContact(boolean isPrimaryContact) {
		this.isPrimaryContact = isPrimaryContact;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Long getRelationshipId() {
		return relationshipId;
	}

	public void setRelationshipId(Long relationshipId) {
		this.relationshipId = relationshipId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
