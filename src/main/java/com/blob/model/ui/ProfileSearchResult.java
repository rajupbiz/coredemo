package com.blob.model.ui;

import java.util.List;

public class ProfileSearchResult {

	private Long totalRecords;
	private Integer pageSize;
	private Integer totalPages;
	private Integer currentPageNo;
	private Integer nextPageNo;
	private Integer previousPageNo;
	private List<ProfileSummary> profiles;

	public Long getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Long totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(Integer currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	public List<ProfileSummary> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<ProfileSummary> profiles) {
		this.profiles = profiles;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getNextPageNo() {
		return nextPageNo;
	}
	public void setNextPageNo(Integer nextPageNo) {
		this.nextPageNo = nextPageNo;
	}
	public Integer getPreviousPageNo() {
		return previousPageNo;
	}
	public void setPreviousPageNo(Integer previousPageNo) {
		this.previousPageNo = previousPageNo;
	}
}
