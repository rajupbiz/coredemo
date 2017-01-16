package com.blob.model.candidate;

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

import com.blob.model.master.MasterCountry;
import com.blob.model.master.MasterState;

@Entity
@Table(name="candidate_address")
public class CandidateAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	/*@OneToOne
	@JoinColumn(name="address_type_id")
	private MasterAddressType addressType;*/

	@Column(name="address_type")
	private String addressType;
	
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
	
	@OneToOne
	@JoinColumn(name="state_id")
	private MasterState state;

	@OneToOne
	@JoinColumn(name="country_id")
	private MasterCountry country;
	
	@Column(name="other_state")
	private String otherState;
	
	@Column(name="other_country")
	private String otherCountry;
	
	@Column(name="pincode")
	private String pincode;
	
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
	private Long stateId;
	
	@Transient
	private Long countryId;
	
	@Transient
	private Long specifyOtherStateId;
	
	@Transient
	private Long specifyOtherCountryId;
	
	@Transient
	private String addressStr;
	
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

	/*public MasterAddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(MasterAddressType addressType) {
		this.addressType = addressType;
	}*/

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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	public MasterState getState() {
		return state;
	}

	public void setState(MasterState state) {
		this.state = state;
	}

	public MasterCountry getCountry() {
		return country;
	}

	public void setCountry(MasterCountry country) {
		this.country = country;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getOtherState() {
		return otherState;
	}

	public void setOtherState(String otherState) {
		this.otherState = otherState;
	}

	public String getOtherCountry() {
		return otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
	}

	public Long getSpecifyOtherStateId() {
		return specifyOtherStateId;
	}

	public void setSpecifyOtherStateId(Long specifyOtherStateId) {
		this.specifyOtherStateId = specifyOtherStateId;
	}

	public Long getSpecifyOtherCountryId() {
		return specifyOtherCountryId;
	}

	public void setSpecifyOtherCountryId(Long specifyOtherCountryId) {
		this.specifyOtherCountryId = specifyOtherCountryId;
	}

	public String getAddressStr() {
		return addressStr;
	}

	public void setAddressStr(String addressStr) {
		this.addressStr = addressStr;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	
	
	
}
