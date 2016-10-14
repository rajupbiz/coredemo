package com.blob.model.candidate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blob.model.master.MasterCharan;
import com.blob.model.master.MasterDayOfWeek;
import com.blob.model.master.MasterGan;
import com.blob.model.master.MasterNadi;
import com.blob.model.master.MasterNakshtra;
import com.blob.model.master.MasterRashi;

@Entity
@Table(name="candidate_astro_detail")
public class CandidateAstroDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@Column(name="birth_name")
	private String birthName;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="birth_time")
	private Date birthTime;

	@OneToOne
	@JoinColumn(name="birth_day_of_week_id")
	private MasterDayOfWeek birthDayOfWeek;
	
	@Column(name="birth_place")
	private String birthPlace;
	
	@Column(name="mangal")
	private Boolean mangal;
	
	@Column(name="believe_in_horoscope")
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
	private MasterCharan charan;
	
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

	public boolean isBelieveInHoroscope() {
		return believeInHoroscope;
	}

	public void setBelieveInHoroscope(boolean believeInHoroscope) {
		this.believeInHoroscope = believeInHoroscope;
	}

	public String getHoro() {
		return horo;
	}

	public void setHoro(String horo) {
		this.horo = horo;
	}

	public MasterRashi getRashi() {
		return rashi;
	}

	public void setRashi(MasterRashi rashi) {
		this.rashi = rashi;
	}

	public MasterGan getGan() {
		return gan;
	}

	public void setGan(MasterGan gan) {
		this.gan = gan;
	}

	public MasterNadi getNadi() {
		return nadi;
	}

	public void setNadi(MasterNadi nadi) {
		this.nadi = nadi;
	}

	public MasterNakshtra getNakshtra() {
		return nakshtra;
	}

	public void setNakshtra(MasterNakshtra nakshtra) {
		this.nakshtra = nakshtra;
	}

	public MasterCharan getCharan() {
		return charan;
	}

	public void setCharan(MasterCharan charan) {
		this.charan = charan;
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

	public MasterDayOfWeek getBirthDayOfWeek() {
		return birthDayOfWeek;
	}

	public void setBirthDayOfWeek(MasterDayOfWeek birthDayOfWeek) {
		this.birthDayOfWeek = birthDayOfWeek;
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

	
	
	
}
