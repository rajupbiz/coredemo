package com.blob.model;

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
@Table(name="user_session")
public class UserSession {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@Column(name="session_id")
	private String sessionId;
	
	@Column(name="session_created_on")
	private Date sessionCreatedOn;

	@Column(name="session_invalidated_on")
	private Date sessionInvalidatedOn;
	
	@Column(name="session_interval")
	private Date sessionInterval;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getSessionCreatedOn() {
		return sessionCreatedOn;
	}

	public void setSessionCreatedOn(Date sessionCreatedOn) {
		this.sessionCreatedOn = sessionCreatedOn;
	}

	public Date getSessionInvalidatedOn() {
		return sessionInvalidatedOn;
	}

	public void setSessionInvalidatedOn(Date sessionInvalidatedOn) {
		this.sessionInvalidatedOn = sessionInvalidatedOn;
	}

	public Date getSessionInterval() {
		return sessionInterval;
	}

	public void setSessionInterval(Date sessionInterval) {
		this.sessionInterval = sessionInterval;
	}

	
}
