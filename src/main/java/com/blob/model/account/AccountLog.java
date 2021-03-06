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

import com.blob.model.master.MasterPrivilege;

@Entity
@Table(name="account_log")
public class AccountLog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;

	@ManyToOne
	@JoinColumn(name="account_session_id")
	private AccountSession accountSession;
	
	@ManyToOne
	@JoinColumn(name="privilege_id")
	private MasterPrivilege privilege;
	
	@Column(name=" request_in_on")
	private Date request_in_on;
	
	@Column(name="request_out_on")
	private Date request_out_on;
	
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

	public MasterPrivilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(MasterPrivilege privilege) {
		this.privilege = privilege;
	}

	public Date getRequest_in_on() {
		return request_in_on;
	}

	public void setRequest_in_on(Date request_in_on) {
		this.request_in_on = request_in_on;
	}

	public Date getRequest_out_on() {
		return request_out_on;
	}

	public void setRequest_out_on(Date request_out_on) {
		this.request_out_on = request_out_on;
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
