package com.blob.model.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.blob.model.account.AccountSession;

@Entity
@Table(name="error_log")
public class ErrorLog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="account_session_id")
	private AccountSession accountSession;

	@Column(name="error_level")
	private String errorLevel;
	
	@Column(name="error_code")
	private String errorCode;
	
	@Column(name="error_message")
	private String errorMessage;
	
	@Column(name="error_cause")
	private String errorCause;
	
	@Column(name="create_on")
	private Date create_on;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreate_on() {
		return create_on;
	}

	public void setCreate_on(Date create_on) {
		this.create_on = create_on;
	}

	public String getErrorLevel() {
		return errorLevel;
	}

	public void setErrorLevel(String errorLevel) {
		this.errorLevel = errorLevel;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCause() {
		return errorCause;
	}

	public void setErrorCause(String errorCause) {
		this.errorCause = errorCause;
	}

	public AccountSession getAccountSession() {
		return accountSession;
	}

	public void setAccountSession(AccountSession accountSession) {
		this.accountSession = accountSession;
	}

}
