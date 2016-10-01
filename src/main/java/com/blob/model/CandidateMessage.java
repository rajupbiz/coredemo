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
@Table(name="candidate_message")
public class CandidateMessage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	// unique id to message, helpful is message is sent to multiple users, use synchonisation to generate and save message id using max(messageId) + 1
	@Column(name="message_id")
	private String messageId;
	
	// In / Out
	@Column(name="type")
	private String type;
	
	// 
	@Column(name="category")
	private String category;
	
	// From whom message is in
	@ManyToOne
	@JoinColumn(name="from_candidate_id")
	private Candidate from;
	
	// To whom message is sent
	@ManyToOne
	@JoinColumn(name="to_candidate_id")
	private Candidate to;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="body")
	private String body;
	
	@Column(name="status")
	private String status;
	
	@Column(name="create_user")
	private Long createUser;
	
	@Column(name="create_on")
	private Date createOn;
	
	@Column(name="update_user")
	private Long updateUser;
	
	@Column(name="update_on")
	private Date updateOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
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

	public Candidate getFrom() {
		return from;
	}

	public void setFrom(Candidate from) {
		this.from = from;
	}

	public Candidate getTo() {
		return to;
	}

	public void setTo(Candidate to) {
		this.to = to;
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

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateOn() {
		return createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
}
