package com.blob.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blob.model.master.MasterAddressType;

@Entity
@Table(name="candidate_address")
public class CandidateAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@OneToOne
	@JoinColumn(name="address_type_id")
	private MasterAddressType addressType;

	@Column(name="address_line")
	private String addressLine;
	
	@Column(name="landmark")
	private String landmark;

	@Column(name="city_or_town")
	private String cityOrTown;
	
	@Column(name="tahsil")
	private String tahsil;

	@Column(name="district")
	private String district;
	
	@Column(name="state")
	private String state;

	@Column(name="country")
	private String country;
	
	@Column(name="pincode")
	private String pincode;
	
	@Column(name="status")
	private Character status;
	
	@Column(name="create_user")
	private Long createUser;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_user")
	private Long updateUser;
	
	@Column(name="update_on")
	private Date updateOn;

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

	public MasterAddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(MasterAddressType addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCityOrTown() {
		return cityOrTown;
	}

	public void setCityOrTown(String cityOrTown) {
		this.cityOrTown = cityOrTown;
	}

	public String getTahsil() {
		return tahsil;
	}

	public void setTahsil(String tahsil) {
		this.tahsil = tahsil;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
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

	
	
	
}
