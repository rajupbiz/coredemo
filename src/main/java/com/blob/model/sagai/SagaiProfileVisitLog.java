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

import com.blob.model.user.User;

@Entity
@Table(name="sagai_profile_visit_log")
public class SagaiProfileVisitLog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="visitor_user_id")
	private User visitorUser;
	
	@ManyToOne
	@JoinColumn(name="visited_user_id")
	private User visitedUser;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_on")
	private Date createOn;
	
	/*@Column(name="update_user")
	private Long updateUser;*/
	
	@Column(name="update_on")
	private Date updateOn;

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

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public User getVisitorUser() {
		return visitorUser;
	}

	public void setVisitorUser(User visitorUser) {
		this.visitorUser = visitorUser;
	}

	public User getVisitedUser() {
		return visitedUser;
	}

	public void setVisitedUser(User visitedUser) {
		this.visitedUser = visitedUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
