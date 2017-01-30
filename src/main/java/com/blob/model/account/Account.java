package com.blob.model.account;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blob.model.user.User;

@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="gid",nullable=false,length=6,unique=true)
	private String gid;
	
	@OneToOne(mappedBy="account")
	private User user;

	/*@OneToOne
	@JoinColumn(name="user_type_id")
	private MasterUserType userType;*/
	
	@OneToMany(mappedBy="account")
	private List<AccountRole> accountRoles;
	
	@Column(name="last_logged_in")
	private Date lastLoggedIn;
	
	@Column(name="status")
	private String status;
	
	/*@Column(name="create_user")
	private Long createUser;*/
	
	@Column(name="create_on")
	private Date createOn;
	
	/*@Column(name="update_user")
	private Long updateUser;*/
	
	@Column(name="update_on")
	private Date updateOn;
	
	@Column(name="is_sagai_service_active")
	private Boolean isSagaiServiceActive;
	
	@Column(name="is_job_service_active")
	private Boolean isJobServiceActive;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public MasterUserType getUserType() {
		return userType;
	}

	public void setUserType(MasterUserType userType) {
		this.userType = userType;
	}*/

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<AccountRole> getAccountRoles() {
		return accountRoles;
	}

	public void setAccountRoles(List<AccountRole> accountRoles) {
		this.accountRoles = accountRoles;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getGid() {
		return gid;
	}

	public void setGid(String gid) {
		this.gid = gid;
	}

	public Boolean getIsSagaiServiceActive() {
		return isSagaiServiceActive;
	}

	public void setIsSagaiServiceActive(Boolean isSagaiServiceActive) {
		this.isSagaiServiceActive = isSagaiServiceActive;
	}

	public Boolean getIsJobServiceActive() {
		return isJobServiceActive;
	}

	public void setIsJobServiceActive(Boolean isJobServiceActive) {
		this.isJobServiceActive = isJobServiceActive;
	}
}
