package com.blob.model.user;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blob.model.account.Account;
import com.blob.model.sagai.SagaiShortlistedProfile;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="gid",nullable=false,length=6)
	private String gid;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@OneToMany(mappedBy="user")
	private List<SagaiShortlistedProfile> sagaiShortlistedProfiles;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy="user")
	private UserPersonal userPersonal;
	
	@OneToOne(mappedBy="user")
	private UserFamily userFamily;
	
	@OneToOne(mappedBy="user")
	private UserAstro userAstro;
	
	@OneToMany(mappedBy="user")
	private List<UserEducation> userEducations;
	
	@OneToMany(mappedBy="user")
	private List<UserAddress> userAddresses;
	
	@OneToMany(mappedBy="user")
	private List<UserContact> userContacts;
	
	@OneToMany(mappedBy="user")
	private List<UserOccupation> userOccupations;
	
	@OneToMany(mappedBy="user")
	private List<UserMessage> userMessages;
	
	@OneToMany(mappedBy="user")
	private List<UserPhoto> userPhotos;
	
	@OneToMany(mappedBy="user")
	private List<SagaiShortlistedProfile> sagaiShortlistedProfile;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;
	
	/*@Column(name="update_user")
	private Long updateUser;*/
	
	@Column(name="update_on")
	private Date updateOn;
	
	/*@OneToOne
	@JoinColumn(name="yearly_income_id")
	private MasterYearlyIncome yearlyIncome;*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<SagaiShortlistedProfile> getSagaiShortlistedProfiles() {
		return sagaiShortlistedProfiles;
	}

	public void setSagaiShortlistedProfiles(List<SagaiShortlistedProfile> sagaiShortlistedProfiles) {
		this.sagaiShortlistedProfiles = sagaiShortlistedProfiles;
	}

	public UserPersonal getUserPersonal() {
		return userPersonal;
	}

	public void setUserPersonal(UserPersonal userPersonal) {
		this.userPersonal = userPersonal;
	}

	public UserFamily getUserFamily() {
		return userFamily;
	}

	public void setUserFamily(UserFamily userFamily) {
		this.userFamily = userFamily;
	}

	public UserAstro getUserAstro() {
		return userAstro;
	}

	public void setUserAstro(UserAstro userAstro) {
		this.userAstro = userAstro;
	}

	public List<UserEducation> getUserEducations() {
		return userEducations;
	}

	public void setUserEducations(List<UserEducation> userEducations) {
		this.userEducations = userEducations;
	}

	public List<UserAddress> getUserAddresses() {
		return userAddresses;
	}

	public void setUserAddresses(List<UserAddress> userAddresses) {
		this.userAddresses = userAddresses;
	}

	public List<UserContact> getUserContacts() {
		return userContacts;
	}

	public void setUserContacts(List<UserContact> userContacts) {
		this.userContacts = userContacts;
	}

	public List<UserOccupation> getUserOccupations() {
		return userOccupations;
	}

	public void setUserOccupations(List<UserOccupation> userOccupations) {
		this.userOccupations = userOccupations;
	}

	public List<UserMessage> getUserMessages() {
		return userMessages;
	}

	public void setUserMessages(List<UserMessage> userMessages) {
		this.userMessages = userMessages;
	}

	public List<UserPhoto> getUserPhotos() {
		return userPhotos;
	}

	public void setUserPhotos(List<UserPhoto> userPhotos) {
		this.userPhotos = userPhotos;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public List<SagaiShortlistedProfile> getSagaiShortlistedProfile() {
		return sagaiShortlistedProfile;
	}

	public void setSagaiShortlistedProfile(List<SagaiShortlistedProfile> sagaiShortlistedProfile) {
		this.sagaiShortlistedProfile = sagaiShortlistedProfile;
	}

}
