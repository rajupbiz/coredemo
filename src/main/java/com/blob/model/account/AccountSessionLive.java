package com.blob.model.account;

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
@Table(name="account_session_live")
public class AccountSessionLive {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;

	@ManyToOne
	@JoinColumn(name="account_session_id")
	private AccountSession accountSession;
	
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

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountSession getAccountSession() {
		return accountSession;
	}

	public void setAccountSession(AccountSession accountSession) {
		this.accountSession = accountSession;
	}

}
