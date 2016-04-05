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

import com.blob.model.master.MasterPrivilege;

@Entity
@Table(name="user_log")
public class UserLog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name="user_session_id")
	private UserSession userSession;
	
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserSession getUserSession() {
		return userSession;
	}

	public void setUserSession(UserSession userSession) {
		this.userSession = userSession;
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

}
