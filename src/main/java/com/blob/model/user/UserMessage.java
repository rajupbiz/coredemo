package com.blob.model.user;

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
@Table(name="user_message")
public class UserMessage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	// parent massage for reply, forward etc.
	@Column(name="parent_message_id")
	private String parentMessageId;
	
	// type : new, reply, forward
	@Column(name="type")
	private String type;
	
	// direction : receive, sent (in/out)
	@Column(name="direction")
	private String direction;
	
	// Candidate, Promotional, Job etc
	@Column(name="category")
	private String category;
	
	// From whom message is in
	@ManyToOne
	@JoinColumn(name="from_user_id")
	private User from;
	
	// To whom message is sent
	@ManyToOne
	@JoinColumn(name="to_user_id")
	private User to;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="body")
	private String body;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}*/

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	/*public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}*/

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getParentMessageId() {
		return parentMessageId;
	}

	public void setParentMessageId(String parentMessageId) {
		this.parentMessageId = parentMessageId;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public User getTo() {
		return to;
	}

	public void setTo(User to) {
		this.to = to;
	}
}
