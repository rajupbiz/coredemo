package com.blob.model.sagai;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sagai_search_log_detail")
public class SagaiSearchLogDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="search_log_id")
	private SagaiSearchLog searchLog;

	@Column(name="search_key")
	private String searchKey;
	
	@Column(name="search_value")
	private String searchValue;

	@Column(name="create_on")
	private Date createOn;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public SagaiSearchLog getSearchLog() {
		return searchLog;
	}

	public void setSearchLog(SagaiSearchLog searchLog) {
		this.searchLog = searchLog;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	
}
