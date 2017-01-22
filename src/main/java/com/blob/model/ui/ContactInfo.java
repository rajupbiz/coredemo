package com.blob.model.ui;

import java.util.List;

import com.blob.model.candidate.CandidateAddress;
import com.blob.model.candidate.CandidateContact;
import com.blob.model.master.MasterCountry;
import com.blob.model.master.MasterRelationship;
import com.blob.model.master.MasterState;

public class ContactInfo {

	private String nativePlace;
	private String currentLocation;
	private List<CandidateContact> contacts;
	private CandidateAddress address;
	private List<MasterRelationship> relationshipOptions;
	private List<MasterState> stateOptions;
	private List<MasterCountry> countryOptions;
	
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public List<CandidateContact> getContacts() {
		return contacts;
	}
	public void setContacts(List<CandidateContact> contacts) {
		this.contacts = contacts;
	}
	public CandidateAddress getAddress() {
		return address;
	}
	public void setAddress(CandidateAddress address) {
		this.address = address;
	}
	public List<MasterRelationship> getRelationshipOptions() {
		return relationshipOptions;
	}
	public void setRelationshipOptions(List<MasterRelationship> relationshipOptions) {
		this.relationshipOptions = relationshipOptions;
	}
	public List<MasterState> getStateOptions() {
		return stateOptions;
	}
	public void setStateOptions(List<MasterState> stateOptions) {
		this.stateOptions = stateOptions;
	}
	public List<MasterCountry> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(List<MasterCountry> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
}
