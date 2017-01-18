package com.blob.model.ui;

import java.util.List;

import com.blob.model.master.MasterDegree;

public class ProfileFilter {

	private Long loggedInCandidateId;
	private String gid;
	private String name;
	private String city;
	private String education;
	private Integer pageNo;
	private List<MasterDegree> degreeOptions;
	
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public List<MasterDegree> getDegreeOptions() {
		return degreeOptions;
	}
	public void setDegreeOptions(List<MasterDegree> degreeOptions) {
		this.degreeOptions = degreeOptions;
	}
	public Long getLoggedInCandidateId() {
		return loggedInCandidateId;
	}
	public void setLoggedInCandidateId(Long loggedInCandidateId) {
		this.loggedInCandidateId = loggedInCandidateId;
	}
}
