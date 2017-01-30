package com.blob.model.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_astro")
public class UserAstro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="birth_name")
	private String birthName;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name="birth_time")
	private Date birthTime;
	
	@Column(name="birth_day_of_week")
	private String birthDayOfWeek;
	
	@Column(name="birth_place")
	private String birthPlace;
	
	@Column(name="mangal")
	private Boolean mangal;
	
	@Column(name="create_on")
	private Date createOn;
	
	/*@Column(name="update_user")
	private Long updateUser;*/
	
	@Column(name="update_on")
	private Date updateOn;
	
	/*@Column(name="believe_in_horoscope")
	private boolean believeInHoroscope;
	
	@Column(name="horo")
	private String horo;
	
	@OneToOne
	@JoinColumn(name="rashi_id")
	private MasterRashi rashi;
	
	@OneToOne
	@JoinColumn(name="gan_id")
	private MasterGan gan;
	
	@OneToOne
	@JoinColumn(name="nadi_id")
	private MasterNadi nadi;
	
	@OneToOne
	@JoinColumn(name="nakshtra_id")
	private MasterNakshtra nakshtra;
	
	@OneToOne
	@JoinColumn(name="charan_id")
	private MasterCharan charan;*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Boolean isMangal() {
		return mangal;
	}

	public void setMangal(Boolean mangal) {
		this.mangal = mangal;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBirthName() {
		return birthName;
	}

	public void setBirthName(String birthName) {
		this.birthName = birthName;
	}

	public Date getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(Date birthTime) {
		this.birthTime = birthTime;
	}

	public String getBirthDayOfWeek() {
		return birthDayOfWeek;
	}

	public void setBirthDayOfWeek(String birthDayOfWeek) {
		this.birthDayOfWeek = birthDayOfWeek;
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

	public Boolean getMangal() {
		return mangal;
	}
}
